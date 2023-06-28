package kiosk.chickin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


    @WebServlet("/delivery")
    public class Delivery extends HttpServlet {
        public Delivery() {
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("UTF-8");


            RequestDispatcher rd = req.getRequestDispatcher("ricecake");
            rd.forward(req, resp);
        }
    }

