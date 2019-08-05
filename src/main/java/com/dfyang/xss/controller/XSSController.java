package com.dfyang.xss.controller;

import com.dfyang.xss.aop.PreventXSSMethod;
import com.dfyang.xss.aop.PreventXSSParameter;
import com.dfyang.xss.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Auther: 55411
 * @Date: 2019/6/21 14:19
 * @Description: 测试Controller
 */
@Controller
public class XSSController {

    @GetMapping("/register")
    public String insert() {
        return "register";
    }

    @PostMapping("/info")
    public String info(@PreventXSSParameter User user, Model model) {
        model.addAttribute("user", user);
        return "info";
    }
}
