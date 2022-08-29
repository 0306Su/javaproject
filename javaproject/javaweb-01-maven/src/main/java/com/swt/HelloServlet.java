package com.swt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author admin
 * @Classname HelloServlet
 * @Version 1.0.0
 * @Date 2022/7/18 8:48
 */
public class HelloServlet  extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //响应类型html
        resp.setContentType("text/html");
        //响应的输出流
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>hello SuWenTing Wold</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>hello  SuWenTing Wold !</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
