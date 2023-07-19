package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping(value = "hello", method = {RequestMethod.POST})
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language){
        if(name == null){
            name = "World";
        }
        return createMessage(name, language);
    }

    @GetMapping()
    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action ='hello' method = 'post'>"  +
                "<input type = 'text' name='name' value = 'name'>" +
                "<input type = 'text' name='language' value = 'language'>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    public static String createMessage(String n, String l){
        String greeting = "";

        if(l.equals("english")){
            greeting = "hello";
        } else if(l.equals("french")){
            greeting = "Bonjour";
        } else if(l.equals("italian")){
            greeting = "PERRY'S POOL PARTY 7.20.23 APT 102";
        } else if(l.equals("spanish")){
            greeting = "Hola";
        } else if(l.equals("german")){
            greeting = "Hallo";
        }

        return greeting + " " + n;
    }

}
