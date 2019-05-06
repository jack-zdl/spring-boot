package com.example.demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Tomcat {

    private int port = 8080;
    private Map<String, String> urlServletMap = new HashMap<String, String>();

    public Tomcat(int port) {
        this.port = port;
    }


    public static void main(String[] args) {
        new Tomcat(8090).start();
    }

    public void start() {
        // 初始化 URL与对应处理的servlet的关系
        initSercletMapping();

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("C-Tomcat is start...");

            while (true) {
                Socket socket = serverSocket.accept();

                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();

                CRequest cRequest = new CRequest(inputStream);
                CResponse cResponse = new CResponse(outputStream);

                // 请求分发
                dispatch(cRequest, cResponse);

                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void initSercletMapping() {
        for (ServletMapping servletMapping : ServletMappingConfig.servletMappings) {
            urlServletMap.put(servletMapping.getUrl(), servletMapping.getClazz());
        }
    }

    private void dispatch(CRequest request, CResponse response) {
        if (request.getUrl().equalsIgnoreCase("/favicon.ico")) {
            return;
        }
        String clazz = urlServletMap.get(request.getUrl());

        try {
            Class<CServlet> cServletClass = (Class<CServlet>) Class.forName(clazz);
            CServlet cServlet = cServletClass.getDeclaredConstructor().newInstance();
            cServlet.service(request, response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
