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
         if(command.equals("/boardList")){


         }else if(command.equals("/boardForm")){


         }else if(command.equals("/boardWrite")){


         }else if(command.equals("/boardDelete")){
             
         }
    }
}
