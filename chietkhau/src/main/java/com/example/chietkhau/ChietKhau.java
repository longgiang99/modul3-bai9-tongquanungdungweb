package com.example.chietkhau;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/discount")
public class ChietKhau extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Hello World!";
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }
//
//    public void destroy() {
//    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String aaa = req.getParameter("aaa");
        double price = Double.parseDouble(req.getParameter("bbb"));
        double percent = Double.parseDouble(req.getParameter("ccc"));
 // Tính toán chiết khấu và giá sau khi đã được chiết khấu
       double discountAmount = price * percent * 0.01;
       double discountPrice = price - discountAmount;
       //hien thi ket qua
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
            out.println("<p>list price: "+ price+ "</p>");
        out.println("<p>Discount Percent: " + percent + "%</p>");
        out.println("<p>Discount Amount: $" + discountAmount + "</p>");
        out.println("<p>Discount Price: $" + discountPrice + "</p>");


    }
}