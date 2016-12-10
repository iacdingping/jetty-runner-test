package com.iac.test.web02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping
    @ResponseBody
    public String index() {
        System.out.println("hello may be you are right ");

        return "test-index";
    }
}
