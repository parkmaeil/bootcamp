package controller;
import entity.Member;
import utility.MyHap;

import javax.servlet.RequestDispatcher;
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
       //MyHap my=new MyHap();
       //int result=my.hap(); //55
       // 회원(class=>Modeling 도구)정보를 받았다.
       Member m=new Member(1, "관리자", 30,"광주광역시");

       // 3. 응답 -> 직접(html) -> JSP(result.jsp)
       // 객체바인딩(setAttribute)
       req.setAttribute("member", m); // new Integer(result)
        // forward(포워드)
       RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/result.jsp");
       rd.forward(req, resp);
    }
}
