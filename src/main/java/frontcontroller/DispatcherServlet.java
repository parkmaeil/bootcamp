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
         // 2.컨트롤러 분기 작업(HandlerMapping)
         Controller controller=null;
         String viewName=null;
         if(command.equals("/boardList.do")){
             controller=new BoardListController(); //POJO
             viewName=controller.requestHandler(req, resp);
         }else if(command.equals("/boardForm.do")){
             controller=new BoardFormController();
             viewName=controller.requestHandler(req, resp);
         }else if(command.equals("/boardWrite.do")){
             controller=new BoardWriteController();
             viewName=controller.requestHandler(req, resp);
         }else if(command.equals("/boardDelete.do")){
             controller=new BoardDeleteController();
             viewName=controller.requestHandler(req, resp);
         }//end
        // 3.뷰 페이지 분기 작업(viewName)
        // forward("boardList")
        if(viewName!=null) {
            if(!viewName.contains(":/")) {
                RequestDispatcher rd = req.getRequestDispatcher(ViewResolver.makeView(viewName));
                rd.forward(req, resp);
            }else {
                // redirect("redirect:/boardList.do")
                resp.sendRedirect(viewName.split(":/")[1]);// boardList.do
            }
        }
    }
}
