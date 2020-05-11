package com.codegym.controller;

import com.codegym.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")// Dung de luu tru @ModelAttribute trong session.
public class CounterController {

    @ModelAttribute("mycounter")//Lien ket voi phuong thuc de tra ve gia tri cho Model vaf sau do tra ve view.
    public MyCounter setUpCounter(){ //Tra ve 1 doi tuong.
        return new MyCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") MyCounter myCounter){
        myCounter.increment(); // Cu moi lan truy cap vao thi so luong view se tang len.
        return "index";

    }


}
