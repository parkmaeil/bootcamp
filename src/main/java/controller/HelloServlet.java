package controller;
import utility.MyHap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hs") // web.xml(servlet-mapping)
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // 1. 요청을 받는다 : 1~10 = 55
        // 2. 처리를 한다(Model->POJO->Service)
       MyHap my=new MyHap();
       int result=my.hap(); //55
       // 3. 응답 -> 직접(html) -> JSP
       resp.setContentType("text/html;charset=utf-8");
       PrintWriter out=resp.getWriter();
       out.println("<html>");
       out.println("<body>");
       out.println("총합:"+result);
       out.println("</body>");
       out.println("</html>");
    }
}
