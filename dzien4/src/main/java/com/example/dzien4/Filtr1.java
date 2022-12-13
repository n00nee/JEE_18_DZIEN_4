package com.example.dzien4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class Filtr1 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("windows-1250");
        response.setContentType("Application/JSON");
        response.setContentLength(1000);
        chain.doFilter(request, response);
    }
}
