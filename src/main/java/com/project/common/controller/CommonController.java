package com.project.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	@GetMapping("hello")
    public String hello(Model model){
		System.out.println("qwer");
        model.addAttribute("data", "sprdding!!");
        return "hello";
    }
}
