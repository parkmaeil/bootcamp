package frontcontroller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// FrontController
@WebServlet("/*")  // /boardList.do
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
         // 컨트롤러 분기 작업
         if(command.equals("/boardList")){
             System.out.println("게시판 리스트처리");
         }else if(command.equals("/boardForm")){
             System.out.println("게시판 폼 처리");
         }else if(command.equals("/boardWrite")){
             System.out.println("게시판 글쓰기 처리");
         }else if(command.equals("/boardDelete")){
             System.out.println("게시판 삭제처리");
         }//end
    }
}
