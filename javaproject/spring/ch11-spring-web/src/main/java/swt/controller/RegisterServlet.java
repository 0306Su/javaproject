package swt.controller; /**
 * @Classname ${NAME}
 * @Version 1.0.0
 * @Date 2022/7/14 17:48
 * @author admin
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import swt.domian.Student;
import swt.service.StudentService;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.servlet.ServletContext;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String strId = request.getParameter("id");
        String strName = request.getParameter("name");
        String strEmail = request.getParameter("email");
        String strAge = request.getParameter("age");

        //创建spring的容器对象
        //String config = "spring.xml";
        //ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        WebApplicationContext ctx =null;
       /* //获取ServletContext中容器的对象，创建好容器的对象，就拿来用
        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        Object attr = getServletContext().getAttribute(key);
        if(attr!=null){
            ctx = (WebApplicationContext) attr;
        }*/

        //使用框架的中的方法
        ServletContext sc =  (ServletContext)getServletContext();
        WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        System.out.println("容器对象的信息====== " + ctx);

        //获取service
        StudentService service = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setId(Integer.parseInt(strId));
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.valueOf(strAge));
        service.addStudent(student);

        //给一个页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
