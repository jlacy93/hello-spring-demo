package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    //Handles requests at /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring";
    }

    //Handles request of the form /hello?name=launchcode
    //Change GetMapping to RequestMapping for both get and post
//    @GetMapping("hello")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //handles requests of the form /hello/launchcode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + '!';
    }

//Get Request
//    @GetMapping("form")
//    @ResponseBody
//    public String helloForm(){
//        return "<html>" +
//                "<body>" +
//                "<form action ='hello'>" + //submit a request to /hello
//                "<input type = 'text' name='name'>" +
//                "<input type = 'submit' value = 'Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    //Post Request
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }
}
