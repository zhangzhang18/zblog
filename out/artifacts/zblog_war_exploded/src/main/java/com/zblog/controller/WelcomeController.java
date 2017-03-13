package com.zblog.controller;

import com.zblog.common.session.SessionProvider;
import com.zblog.model.User;
import com.zblog.service.UserService;
import com.zblog.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by hadoop01 on 16-11-21.
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    @Autowired
    private SessionProvider session;
    @Autowired
    private UserService userService;
    @RequestMapping("/index.do")
    public String index(HttpServletRequest request, ModelMap model) {
         User user = UserUtil.getUser(request);

        HttpSession s = request.getSession();
        // s.setAttribute("userDeptId", userDeptId);
        // s.setAttribute("dtlv", dtlv);
           System.out.println(user.getUsername()+"index");
        //model.addAttribute("user", user);
        // System.out.println(user);
        return "index";
    }
    @RequestMapping("/hello.do")
    public String hello() {
     return "welcome/hello";
    }
    @RequestMapping(value = "/register.do",method = RequestMethod.GET)
    public String register() {
        return "welcome/register";
    }
    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    public String registerPOST(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String userpwd = request.getParameter("userpwd");
        User newuser = new User();
        newuser.setEmail(email);
        newuser.setUsername(username);
        newuser.setUserpwd(userpwd);
        int insert = this.userService.insert(newuser);
        if (insert!=0) {
            System.out.println("用户数据插入成功！！！");
        } else {
            System.out.println("用户数据插入失败！！！");
        }
        return "welcome/login";
    }
    @RequestMapping("/login.do")
    public String login() {
        return "welcome/login";
    }
    @RequestMapping("/article.do")
    public String article() {
        return "welcome/article";
    }
    @RequestMapping("/message.do")
    public String message() {
        return "welcome/message";
    }
    @RequestMapping("/discuss.do")
    public String discuss() {
        return "welcome/discuss";
    }
    @RequestMapping("/aboutme.do")
    public String aboutme() {
        return "welcome/aboutme";
    }
}
