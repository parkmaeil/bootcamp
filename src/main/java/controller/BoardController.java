package controller;
import entity.Board;
import entity.Member;
import repository.BoardDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/boardList") // web.xml(servlet-mapping)
public class BoardController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        BoardDAO dao=new BoardDAO();
        List<Board> bList=dao.findAll();
        // 객체바인딩
        req.setAttribute("bList", bList); // ${bList}
        // forward(JSP)
        RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/boardList.jsp");
        rd.forward(req, resp);
    }
}
