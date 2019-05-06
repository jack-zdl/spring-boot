package com.example.demo;

import java.io.IOException;
import java.io.OutputStream;

public class CResponse {
    private OutputStream outputStream;

    public CResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException {
        StringBuffer sb = new StringBuffer();
        sb.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html")
                .append("\r\n")
                .append("<html><body>")
                .append(content)
                .append("</body></html>");

        outputStream.write(sb.toString().getBytes());
        outputStream.close();
    }
}
