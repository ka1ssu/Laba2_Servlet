package com.example.laba2;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Contacts", value = "/Contacts")
public class Contacts extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("Contacts.html");
    }

    public void destroy() {
    }
}