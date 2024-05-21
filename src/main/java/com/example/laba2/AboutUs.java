package com.example.laba2;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "AboutUs", value = "/AboutUs")
public class AboutUs extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("AboutUs.html");
    }

    public void destroy() {
    }
}