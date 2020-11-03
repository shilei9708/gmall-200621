package com.atguigu.gmalllogger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MingYue
 * @create 2020-11-03 19:18
 */
//@Controller
@RestController
@Slf4j
public class LoggerController {

    @RequestMapping("test1")
    //@ResponseBody
    public String test1() {
        System.out.println("11111");
        return "success";
    }

    @RequestMapping("test2")
    //@ResponseBody
    public String test2(@RequestParam("name") String name,
                        @RequestParam("age") int age) {
        System.out.println(name + ":" + age);
        return "success";
    }

    @RequestMapping("log")
    public String getLogger(@RequestParam("logString") String logString) {
        //System.out.println(logString);
        log.info(logString);
        return "success";
    }
}
