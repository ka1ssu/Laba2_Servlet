package com.example.laba2;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "FeedBack", value = "/FeedBack")
public class FeedBack extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("FeedBack.html");
    }

    public void destroy() {
    }
}