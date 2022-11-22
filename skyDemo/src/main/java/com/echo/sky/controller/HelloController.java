package com.echo.sky.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author Echo
 * @Description just a test case class
 * @Date 20:02 2022/11/22
 **/
@RestController
public class HelloController {

    /*
     * @Author Echo
     * @Description helloSky
     * @Date 20:01 2022/11/22
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("/helloSky")
    public String sayBoot() {
        return "Hi Skywalking!";
    }

    /*
     * @Author Echo
     * @Description excpSky
     * @Date 20:01 2022/11/22
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("/excpSky")
    public String exception() {
        int i = 1/0;
        return "I made an exception";
    }

}
