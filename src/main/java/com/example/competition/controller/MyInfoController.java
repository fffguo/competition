package com.example.competition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @作者：刘富国
 * @创建时间：2018/2/5 16:55
 */
@Controller
@RequestMapping("/myInfo")
public class MyInfoController {

    @GetMapping("/base")
    public String base(ModelMap modelMap) {
//        modelMap.put("reportList", reportService.findAll(report));
        modelMap.put("myBaseInfo", "active-menu");
        modelMap.put("myInfoUlClass", "collapse in");
        modelMap.put("myInfoClass", "waves-effect waves-dark active-menu");
        return "myBaseInfo";
    }
}
