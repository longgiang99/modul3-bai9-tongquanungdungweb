package com.example.tudien;

import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Dictionary", urlPatterns = "/translate")
public class Dictionary extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
        response.setContentType("text/html; charset=UTF-8");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put(URLEncoder.encode("hello", "UTF-8"), URLEncoder.encode("Xin chào", "UTF-8"));
//        dictionary.put(URLEncoder.encode("how", "UTF-8"), URLEncoder.encode("Thế nào", "UTF-8"));
//        dictionary.put(URLEncoder.encode("book", "UTF-8"), URLEncoder.encode("Quyển vở", "UTF-8"));
//        dictionary.put(URLEncoder.encode("computer", "UTF-8"), URLEncoder.encode("Máy tính", "UTF-8"));
//
//        String search = request.getParameter("txtSearch");
//        search = URLEncoder.encode(search, "UTF-8");
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
//        String result = dictionary.get(search);
//        if(result != null){
//            result = URLDecoder.decode(result, "UTF-8");
//            writer.println("Word: " + URLDecoder.decode(search, "UTF-8"));
//            writer.println("Result: " + result);
//        } else {
//            writer.println("Not found");
//        }
//
//        writer.println("</html>");
//    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String search = request.getParameter("txtSearch");
//        search = URLEncoder.encode(search, "UTF-8");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        String result = dictionary.get(search);
//        result = URLDecoder.decode(result, "UTF-8");
        if(result != null){
            writer.println("Word: " + search);
            writer.println("Result: " + result);
        } else {
            writer.println("Not found");
        }

        writer.println("</html>");
    }
}