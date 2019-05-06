package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ServletMappingConfig {

    public static List<ServletMapping> servletMappings = new ArrayList<ServletMapping>();

    static {
        servletMappings.add(new ServletMapping("findPerson", "/person", "FindPersonServlet"));
        servletMappings.add(new ServletMapping("helloWorld", "/helloWorld", "HelloWorldServlet"));
    }
}
