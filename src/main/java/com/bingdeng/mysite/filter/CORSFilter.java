package com.bingdeng.mysite.filter;

import javax.servlet.*;
import java.io.IOException;

//定义过滤器，方法：
//1、使用@WebFilter注解，成为过滤器。(需要在启动类添加@ServletComponentScan：创建上下文)
//@WebFilter(filterName="CORSFilter",urlPatterns="/*")
//注解用法示例如com.bingdeng.mysite.config.DruidStatFilterd（也要实现Filter，因为这个类WebStatFilter实现了，所以这里就不用写了）的@WebFilter

//2、添加一个Bean（通过这个类（FilterRegistrationBean）创建，将自定义的过滤器（类要实现Filter）set进去），结合@Configuration和@Bean
//如：com.bingdeng.mysite.config.FilterRegisterBean
//这里采用2
public class CORSFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(servletRequest.getLocalAddr()+",test.servletRequest = [" + servletRequest + "], servletResponse = [" + servletResponse + "], filterChain = [" + filterChain + "]");

            filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
