package controller;
import entity.Board;
import repository.BoardDAOMyBatis;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/boardList") // web.xml(servlet-mapping)
public class BoardListController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

       // BoardDAO dao=new BoardDAO(); //JDBC
        BoardDAOMyBatis dao=new BoardDAOMyBatis(); //MyBatis
        List<Board> bList=dao.findAll();
        // 객체바인딩
        req.setAttribute("bList", bList); // ${bList}
        // forward(JSP) // boardList : View의 논리적인이름->/WEB-INF/views/boardList.jsp
        // ViewResolver
        RequestDispatcher rd=req.getRequestDispatcher(ViewResolver.makeView("boardList"));
        rd.forward(req, resp);
    }
}
