package jp.ac.morijyobi.last_kadai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class WebController {

    @GetMapping("/register")
    public String register(Model model) {

        return "";
    }
}
