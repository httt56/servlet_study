package kiosk.chickin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/chickinorder")
public class ChickinOrder extends HttpServlet {
    String name = getServletContext().getRequestCharacterEncoding();

      @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         System.out.println("치킨 무문후 페이지 넘김");
         resp.sendRedirect("redirect");


    }
}

