package com.springboot.mvc.controller;

import com.springboot.common.entity.AnnotationResponse;
import com.springboot.common.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/pathVariableTest")
    public String pathVariable(@ModelAttribute("response") AnnotationResponse response,
                               ModelMap model) {
        return "annotation/pathVariable";
    }

    @GetMapping("/modelAttributeTest")
    public String modelAttribute(@ModelAttribute("response") AnnotationResponse response,
                               @ModelAttribute Member member,
                               ModelMap model) {
        return "annotation/modelAttribute";
    }
}
