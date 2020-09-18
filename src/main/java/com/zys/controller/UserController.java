package com.zys.controller;

import com.zys.exception.MyCustomException;
import com.zys.exception.MyCustomExceptionResolver;
import com.zys.pojo.User;
import com.zys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: SSM-xml
 * @description: UserController
 * @author: xiaozhang6666
 * @create: 2020-09-17 16:52
 **/
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getUserInfo")
    @ResponseBody
    public List<User> getUserInfo() {
        List<User> all = userService.findAll();
        return all;
    }

    /**
     * 功能描述: <br>
     * 〈拦截器测试〉
     *
     * @Param: []
     * @return: java.lang.String
     * @Author: xiaozhang666
     * @Date: 2020/9/18 20:43
     */
    @RequestMapping("toIn")
    public String toIn() {
        System.out.println("拦截器放行了======");
        return "test";
    }
    /**
    * 功能描述: <br>
    * 〈出现异常时的页面处理〉
    * @Param: []
    * @return: void
    * @Author: xiaozhang666
    * @Date: 2020/9/18 20:56
    */ 
    @RequestMapping("toError")
    public void toError() throws MyCustomException {
        throw new MyCustomException("异常了");
    }

}
