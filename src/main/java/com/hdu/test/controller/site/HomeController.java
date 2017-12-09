package com.hdu.test.controller.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CTWLPC on 2017/8/30.
 */
@Controller
@RequestMapping(value = "/site")
public class HomeController {
    @GetMapping(value = "/home")
    public String home(){
        System.out.println("ffff");
        return "/home.html";
    }
}
