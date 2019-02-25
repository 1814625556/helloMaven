package cn.tianyu;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BServlet implements Servlet {
    private ServletConfig config;

    /*
	 * 需要就写，不需要就不写
	 */
    @Override
    public void destroy() {
        System.out.println("啊~我要死了！");
    }

    /*
     * 请放心，这个方法一定会在init()方法之后被调用！
     * init()被调用后，本类的成员this.config已经有值了！
     */
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    /*
     * 没有用的东西，爱实现不实现
     */
    @Override
    public String getServletInfo() {
        return "我是一个快乐的Servlet";
    }

    /*
     * 由Tomcat来调用，并且只调用一次
     * 它是这些方法中第一个被调用的，它会在构造器之后马上被调用！
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        // 把tomcat传递的Servletconfig赋值给本类的一个成员，其实就是把它保存起来，方便在其他方法中使用！
        this.config = config;
        init();
    }

    /*
     * 这个方法是本类自己定义的！不是Servlet接口中的方法
     */
    public void init() {
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1)
            throws ServletException, IOException {
		/*
		 * 这里是否可以使用ServletConfig的成员呢？
		 */
        System.out.println("service,每次处理请求都会被调用！");
    }

    public ServletContext getServletContext() {
        return config.getServletContext();
    }

    public String getServletName() {
        return config.getServletName();
    }

    public String getInitParameter(String name) {
        return config.getInitParameter(name);
    }
}
