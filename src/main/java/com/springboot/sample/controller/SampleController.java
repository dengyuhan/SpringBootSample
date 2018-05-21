package com.springboot.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    /**
     * ResponseBody样例
     * @return
     */
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


/**
 * thymeleaf样例
 * @return
 */
@RequestMapping("/index")
String index(Model model) {
    model.addAttribute("message","Hello Thymeleaf");
    return "index";
}


}
