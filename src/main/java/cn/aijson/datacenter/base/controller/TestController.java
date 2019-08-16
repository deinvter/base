package cn.aijson.datacenter.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class TestController {
    @RequestMapping(value = "/msg",method = RequestMethod.GET)
    public String printHello(){
        return "helloWorld";
    }
}
