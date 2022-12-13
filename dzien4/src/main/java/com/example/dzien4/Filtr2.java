package com.example.dzien4;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filtr2 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String header = httpRequest.getHeader("User-Agent");
        System.out.println(header);

        chain.doFilter(request, response);

        long stopTime = System.currentTimeMillis();

        System.out.println(stopTime - startTime);
    }
}
