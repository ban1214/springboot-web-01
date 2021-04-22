package com.atban.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {

    @GetMapping("/toSuccess")
    public String toSuccess(Model model){
        //model中的数据会被放到请求域中  request.setAttribute("s",ss)
        model.addAttribute("msg","hello 班日天");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
