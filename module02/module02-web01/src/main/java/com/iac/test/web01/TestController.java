package com.iac.test.web01;

import com.iac.test.a.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private ConfigService configService;


    @RequestMapping
    @ResponseBody
    public String index() {
        System.out.println("properties value" + configService.getValue());
        return configService.getValue();
    }
}
