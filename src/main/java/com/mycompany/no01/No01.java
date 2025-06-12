package com.mycompany.no01;


import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.OutputStream;
import java.net.InetSocketAddress;

public class No01 {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new ProductHandler());
        server.start();
        System.out.println("Server started on port 8080");
    }

    static class ProductHandler implements HttpHandler {
        public void handle(HttpExchange exchange) {
            try {
                String response = "<html><body><h2>Product Table</h2>" +
                        "<table border='1'>" +
                        "<tr><th>ID</th><th>Name</th><th>Price</th></tr>" +
                        "<tr><td>1</td><td>Apple</td><td>10</td></tr>" +
                        "<tr><td>2</td><td>Banana</td><td>5</td></tr>" +
                        "<tr><td>3</td><td>Orange</td><td>7</td></tr>" +
                        "<tr><td>4</td><td>Grapes</td><td>12</td></tr>" +
                        "</table></body></html>";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
