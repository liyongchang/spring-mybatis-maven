package com.controler;

import com.domain.User;
import com.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by sw on 2016/11/29.
 */
@Controller
@RequestMapping("User")
public class UserController {
    @Resource
    private IUserService userService;


    @RequestMapping("/showUser.do")
    public String toIndex(HttpServletRequest request, Model model){
        System.out.print("11111111111111");
        User user=new User();
        user.setId("6666");
        user.setSex("1");
        user.setName("lycqqq");
        user.setMessage("dd");
        user.setBirs(new Date());
        this.userService.insert(user);
        model.addAttribute("user", user);
        return "showUser";
    }

}
