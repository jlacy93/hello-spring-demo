package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //Handles requests at /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring";
//    }

    //now lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring";
    }

    //Handles request of the form /hello?name=launchcode
    //Change GetMapping to RequestMapping for both get and post
//    @GetMapping("hello")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //handles requests of the form /hello/launchcode
    @GetMapping("{name}")
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
    // /hello/forms
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action ='hello' method = 'post'>" + //submit a request to /hello
                "<input type = 'text' name='name'>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
