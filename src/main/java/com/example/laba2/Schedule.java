package com.example.laba2;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Schedule", value = "/Schedule")
public class Schedule extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("Schedule.html");
    }

    public void destroy() {
    }
}