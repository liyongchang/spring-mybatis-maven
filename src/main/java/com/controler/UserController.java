package com.controler;

import com.domain.User;
import com.service.IUserService;
import org.junit.Test;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yongchang.li on 2017/2/9.
 */
@Controller
@Scope("prototype")
public class UserController {
    @Resource
    private IUserService userService;


    @RequestMapping(value = {"/", "/welcome**"}, method = RequestMethod.GET)

    public ModelAndView welcomePage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("hello");
        System.out.println("测试spring的scope2");
        System.out.println(this.hashCode());
        return model;

    }

    @RequestMapping(value = "/login**", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");

        return model;

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }


    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        System.out.println("892222wwwwwww");
        User user = new User();
        user.setName("qqqq222");
        user.setEmail("9958@qq.com");
        user.setPassword("123111");
        user.setUsername("ly");
        this.userService.insertUser(user);
        model.addAttribute("user", user);
        return "showUser";
    }


}

