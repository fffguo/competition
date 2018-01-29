package com.example.competition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @作者：刘富国
 * @创建时间：2018/1/29 11:22
 */
@Controller
public class GoPageController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/table")
    public String table(){
        return "table";
    }
    @GetMapping("/form")
    public String form(){
        return "form";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
