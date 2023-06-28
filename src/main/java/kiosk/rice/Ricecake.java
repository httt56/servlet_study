package kiosk.rice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/ricecake")
public class Ricecake extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String hot = req.getParameter("HOT");
        String choice = req.getParameter("choice");
        String ricecakename = req.getParameter("ricecakename");


        System.out.println(name);
        System.out.println(hot);
        System.out.println(choice);
        System.out.println(ricecakename);

        System.out.println(req.getCharacterEncoding());
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");




        Map<String, String[]> reqMap = req.getParameterMap();
        Set<String> keySet = reqMap.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();
            String[] valStrings = reqMap.get(key);

            System.out.println("key : " + key);
            for(int i=0; i<valStrings.length;i++){
                System.out.println("value[" + i + "] : " + valStrings[i]);
            }

            Enumeration<String> names = req.getParameterNames();
            while (names.hasMoreElements()){
                System.out.println(names.nextElement());
            }
            System.out.println("post 처리");
        }
        resp.setContentType("text/html");

        //입력받은 값들을 다음 페이지로 넘겨줌
        StringBuilder responseText = new StringBuilder();
        StringBuilder append = responseText.append("<!DOCTYPE html> \n")
                .append("<html lang=\"en\"> \n")
                .append("<head> \n")
                .append("<title>주문확인</title>\n")
                .append("</head> \n")
                .append("<body>\n")
                .append("<h3 style=\"align-content: center;\">\n")
                .append(name + "님 주문 내역입니다. </h3>")
//                .append("<br> 주소 : " + addr)
                .append("<br> 떡볶이 종류 : " + ricecakename)
                .append("<br> 맵기 : " + hot)
                .append("<br> 토핑 : " + choice)
                .append("<br> 배달원 : 토끼")
                .append("</body> \n")
                .append("</html> \n");

        PrintWriter out = resp.getWriter();
        out.print(responseText.toString());
        out.flush();
        out.close();

    }
}
