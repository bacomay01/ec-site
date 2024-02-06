package jp.ac.morijyobi.last_kadai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @GetMapping("/buy")
    public String buyItems(Model model) {

        return "items/items-buy";
    }

    @GetMapping("/cart")
    public String cartItems(Model model) {

        return "";
    }

}
