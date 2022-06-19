package com.springboot.mvc.controller;

import com.springboot.common.entity.AnnotationResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/annotation")
public class AnnotationController {

    @GetMapping
    public String main() {
        return "index";
    }

    @GetMapping("/requestParamTest")
    public String requestParam(@ModelAttribute("response") AnnotationResponse response,
                               ModelMap model) {
        return "annotation/requestParam";
    }
}
