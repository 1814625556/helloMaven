package cn.tianyu;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CServlet extends BServlet {
    @Override
    public void init() {
        System.out.println("哇～～～～，很高兴啊～～～");
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1)
            throws ServletException, IOException {
        String value = getInitParameter("p1");
    }
}
