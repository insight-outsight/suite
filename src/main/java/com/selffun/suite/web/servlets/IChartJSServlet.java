package com.selffun.suite.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.selffun.suite.pojo.TsetBean;

@WebServlet(urlPatterns = "/is", asyncSupported = true)
public class IChartJSServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("进入Servlet的时间：" + new Date() + ".<br/>");
		//out.flush();

		
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(req.getSession().getServletContext());   
		TsetBean obj = (TsetBean)webApplicationContext.getBean("tsetBean");
		out.println("获取Bean值->"+obj.getVersion());
		out.flush();
		
		// 在子线程中执行业务调用，并由其负责输出响应，主线程退出
		AsyncContext ctx = req.startAsync();
		new Thread(new Executor(ctx)).start();

		out.println("结束Servlet的时间：" + new Date() + ".");
		out.flush();
	}
}

class Executor implements Runnable {
	private AsyncContext ctx = null;

	public Executor(AsyncContext ctx) {
		this.ctx = ctx;
	}

	public void run() {
		try {
			// 等待十秒钟，以模拟业务方法的执行
			Thread.sleep(10000);

			PrintWriter out = ctx.getResponse().getWriter();		
			out.println("<br/>业务处理完毕的时间：" + new Date() + ".");
			out.flush();
			ctx.complete();
		} catch (Exception e) {
			System.out.println("出错");
			e.printStackTrace();
		}
	}

}
