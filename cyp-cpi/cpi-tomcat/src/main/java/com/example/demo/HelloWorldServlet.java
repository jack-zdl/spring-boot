package com.example.demo;

public class HelloWorldServlet extends CServlet {
    public void doGet(CRequest request, CResponse response) {
        try {
            response.write("get hello world....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doPost(CRequest request, CResponse response) {
        try {
            response.write("post hello world...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
