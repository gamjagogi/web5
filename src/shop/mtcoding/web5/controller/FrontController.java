package shop.mtcoding.web5.controller;

import shop.mtcoding.web5.model.Board;
import shop.mtcoding.web5.model.FakeDao;
import shop.mtcoding.web5.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String httpMethod = req.getMethod();
        if(httpMethod.equals("POST")){
            resp.setContentType("text/html; charset=utf-8");
            PrintWriter pw = resp.getWriter();
            pw.println("잘못된 요청입니다");
            return;
        }

        String action = req.getRequestURI();
        System.out.println("uri : "+action);

        if(action.equals("/board.do")){
            Board b1 = new FakeDao().boardData();
            req.setAttribute("board", b1);
            req.getRequestDispatcher("/WEB-INF/views/board.jsp").forward(req, resp);
        }else if(action.equals("/user.do")){
            User u1 = new FakeDao().userData();
            req.setAttribute("user", u1);
            req.getRequestDispatcher("/WEB-INF/views/user.jsp").forward(req, resp);
        }else{
            resp.setContentType("text/html; charset=utf-8");
            PrintWriter pw = resp.getWriter();
            pw.println("잘못된 요청입니다");
        }
    }
}
