package kiosk.chickin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    @WebServlet("/redirect")
    public class ChickinRedirect extends HttpServlet {
        public ChickinRedirect() {
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            System.out.println("토끼치킨 redirect 성공!");
            StringBuilder redirectText = new StringBuilder();
            redirectText.append("<!DOCTYPE html> \n")
                    .append("<html lang=\"en\"> \n")
                    .append("<head>\n")
                    .append("<title>redirect</title>\n")
                    .append("</head>\n")
                    .append("<body>\n")
                    .append(" <h1> 다른 가게로 가세요.</h1> \n")
                    .append("\n")
                    .append("</body>\n")
                    .append("</html>\n");

            resp.setContentType("text/html; charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.print(redirectText.toString());
            out.flush();
            out.close();
        }
    }
