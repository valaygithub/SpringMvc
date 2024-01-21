package com.itv.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    
    @RequestMapping("/")
    public String index()
    {
        System.out.println("starting index");
        return "index.html";
    }
    @RequestMapping("/about")
    public String about()
    {
        System.out.println("starting index");
        return "about.html";
    }
}
