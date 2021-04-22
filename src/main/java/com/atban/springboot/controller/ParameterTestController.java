package com.atban.springboot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class ParameterTestController {
    /**
     * 测试参数@PathVariable 路径变量
     * 测试参数@RequestHeader 获取请求头
     * 测试参数@RequestParam 获取请求参数
     * 测试参数@CookieValue 获取cookie值
     */
    @GetMapping("/person/{userage}/person/{username}")
    public Map<String,Object> getPerson(@PathVariable("userage") Integer age,
                                        @PathVariable("username") String name,
                                        @PathVariable Map<String,String> an,
                                        @RequestHeader("User-Agent") String userAgent,
                                        @RequestHeader Map<String,String> header,
                                        @RequestParam("height") Integer height,
                                        @RequestParam List<String> inters,
                                        @RequestParam Map<String,String> params,
                                        @CookieValue("_ga") String _ga,
                                        @CookieValue("_ga") Cookie cookie){
        Map<String,Object> map=new HashMap<>();
//        map.put("age",age);
//        map.put("name",name);
//        map.put("an",an);
//
//        map.put("userAgent",userAgent);
//        map.put("header",header);

        map.put("height",height);
        map.put("inters",inters);
        map.put("params",params);
        map.put("_ga",_ga);
        System.out.println(cookie);
        return map;
    }

    /**
     * 测试参数@RequestBody 获取请求体
     * @param content
     * @return
     */
    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        Map<String,Object> map=new HashMap<>();
        map.put("content",content);
        return map;
    }

}
