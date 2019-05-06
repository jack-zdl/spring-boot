package com.example.demo;

public class FindPersonServlet extends CServlet {

    public void doGet(CRequest request, CResponse response) {
        try {
            response.write("get person...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doPost(CRequest request, CResponse response) {
        try {
            response.write("post person...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
