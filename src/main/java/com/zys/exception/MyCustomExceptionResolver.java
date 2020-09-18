package com.zys.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: SSM-xml
 * @description:
 * @author: xiaozhang6666
 * @create: 2020-09-18 20:45
 **/
public class MyCustomExceptionResolver implements HandlerExceptionResolver {

    /**
     * 拦截全局异常的
     *
     * @param request  请求对象
     * @param response 响应对象
     * @param handler  被拦截的处理器Controller的方法
     * @param ex       出现了什么异常
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response,
                                         Object handler, Exception ex) {
        //判断是否是自定义异常
        //instanceof 判断当前对象的类型是否是指的类，前提判断对象与该类存在继承关系
        MyCustomException myCustomException = null;
        if (ex instanceof MyCustomException) {
            //如果是，取出自定义异常中错误信息，向用户展示
            myCustomException = (MyCustomException) ex;
        } else {
            //向日志文件中，输出异常信息，供开发人员排查解决问题
            //ex.printStackTrace();
            //如果不是，给用户一个统一的错误提示:
            myCustomException = new MyCustomException("非常抱歉，系统出现重大错误，已邮件告知系统管理员处理，请您耐心等待，稍后尝试");
        }
        String message = myCustomException.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", message);//错误原因
        modelAndView.setViewName("test");//错误页面视图
        return modelAndView;
    }
}