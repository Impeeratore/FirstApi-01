package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    private String myName = "Matteo";

    @GetMapping("")
    public String getName(){
        return "Hello, my name is " + myName;
    }


    @PostMapping("")
    public String postReversedName(){
        return new StringBuilder().append(myName).reverse().toString();
    }

}
