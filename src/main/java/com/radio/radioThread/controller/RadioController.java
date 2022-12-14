package com.radio.radioThread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RadioController {

@GetMapping("/index")
    public String getIndexPage(Model model){
    model.addAttribute("text","ВсЁ не плохо!!!");
    return "index";
}


}
