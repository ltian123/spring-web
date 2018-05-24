package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import service.HelloService;

public class HelloServlet extends HttpServlet {
//	错
//	private ApplicationContext ac;
//	@Override
//	public void init() throws ServletException {
//		ac = new ClassPathXmlApplicationContext(
//				"applicationContext.xml");
//	}
	
	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=request.getParameter("name");
		
//		错
//		ApplicationContext ac = new ClassPathXmlApplicationContext(
//				"applicationContext.xml");
		
		
		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		
		System.out.println(ac);
		
		HelloService helloService=(HelloService) ac.getBean("helloService");
		String message=helloService.sayHello(name);
		
		request.setAttribute("message", message);
		request.getRequestDispatcher("/hello.jsp").forward(request, response);
	}

}
