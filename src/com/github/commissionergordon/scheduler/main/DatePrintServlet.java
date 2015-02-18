package com.github.commissionergordon.scheduler.main;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (
        name = "DatePrintServlet",
        urlPatterns = "/date"
)
public class DatePrintServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        response.getWriter()
                .append(String.format("It's %s now\n\nThis is a test that prints the date\n\n-Team Scheduler", new Date()));
    }
}