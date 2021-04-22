package com.atban.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 *   /person/{path}?xxx=xxx&aaa=ccsc   queryString 查询字符串 @RequestParam
 *   /person/path;age=21;inters=baskteball,girls,dog    矩阵变量
 *
 *   页面开发，cookie被禁用了,session里的值如何使用
 *   session.set(a,x) ---> jsessionid ---> cookie ---> 每次发请求携带
 *   url重写 : /abc;jsessionid=xxx把cookie的值使用矩阵变量的方式进行传递
 */

@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg","成功了!");
        request.setAttribute("code",200);
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map<String,Object> success(@RequestAttribute("msg") String msg,
                                     @RequestAttribute("code") Integer code,
                                      HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();

        Object msg1 = request.getAttribute("msg");

        map.put("reqMethod_msg",msg1);
        map.put("annotation_msg",msg);

        return map;
    }
}
