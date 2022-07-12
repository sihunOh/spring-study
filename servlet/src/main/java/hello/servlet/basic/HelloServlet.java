package hello.servlet.basic;

import java.io.IOException;
import java.rmi.server.ServerCloneException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        // 여러 WAS 서버가 표준 서블릿(HttpServletRequest, HttpServletResponse)을 구현한다.

        System.out.println("HelloServlet.service");
        System.out.println("request: "+ request);
        System.out.println("response: "+ response);

        String username = request.getParameter("username");
        System.out.println("username = "+username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello" + username);
        
    }
}
