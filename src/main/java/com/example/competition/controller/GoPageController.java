package com.example.competition.controller;

import com.example.competition.enums.ReportStatusEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @作者：刘富国
 * @创建时间：2018/1/29 11:22
 */
@Controller
public class GoPageController {
    @GetMapping("/index.html")
    public String index(ModelMap modelMap) {
        modelMap.put("indexClass","active-menu waves-effect waves-dark");
        return "/index";
    }
    @GetMapping("/form.html")
    public String form(){
        return "/form";
    }
    @GetMapping("/test")
    public String test(){
        return "/test";
    }
}
