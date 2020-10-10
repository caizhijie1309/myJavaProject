package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cookie on 2018/1/18.
 */
@RestController
public class Hello {
    @GetMapping(value = "/")
    private String getHello(){
        return "病虫害web接口测试";
    }

}
