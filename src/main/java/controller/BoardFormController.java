package controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardForm")
public class BoardFormController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                               throws ServletException, IOException {
          // 글쓰기 폼으로 forward
          RequestDispatcher rd =req.getRequestDispatcher(ViewResolver.makeView("boardForm"));
          rd.forward(req, resp);
    }
}
