package com.atban.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/user")
    public String get(){
        return "获取用户";
    }

    @PostMapping("/user")
    public String post(){
        return "修改用户";
    }

    @DeleteMapping("/user")
    public String delete(){
        return "删除用户";
    }

    @PutMapping("/user")
    public String submit(){
        return "增加用户";
    }
}
