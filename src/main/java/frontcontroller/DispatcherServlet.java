package frontcontroller;

import controller.*;
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

// FrontController
@WebServlet("*.do")  // /boardList.do
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                               throws ServletException, IOException {
         // 1. 클라이언트의 요청을 확인하기
         // /boardList--->BoardListController
         // /boardDelete-->BoardDeleteController
         String reqURI=req.getRequestURI(); // /b01/boardList
         String ctx=req.getContextPath(); // /b01
         String command=reqURI.substring(ctx.length());
         System.out.println(command);
         // 컨트롤러 분기 작업(HandlerMapping)
         if(command.equals("/boardList.do")){
             BoardListController controller=new BoardListController(); //POJO
             String viewName=controller.requestHandler(req, resp);
             // 포워딩
             RequestDispatcher rd= req.getRequestDispatcher(ViewResolver.makeView(viewName));
             rd.forward(req, resp);
         }else if(command.equals("/boardForm.do")){
             BoardFormController controller=new BoardFormController();
             String viewName=controller.requestHandler(req, resp);
             RequestDispatcher rd= req.getRequestDispatcher(ViewResolver.makeView(viewName));
             rd.forward(req, resp);
         }else if(command.equals("/boardWrite.do")){
             BoardWriteController controller=new BoardWriteController();
             String viewName=controller.requestHandler(req, resp);
             resp.sendRedirect(viewName);
         }else if(command.equals("/boardDelete.do")){
             BoardDeleteController controller=new BoardDeleteController();
             String viewName=controller.requestHandler(req, resp);
             resp.sendRedirect(viewName);
         }//end
    }
}
