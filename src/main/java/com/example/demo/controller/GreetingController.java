package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {
    @GetMapping("/abc")
    String showList(Model model) {
        model.addAttribute("xyz", "Như Anh");
        List<String> lst= new ArrayList<>();
        lst.add("NAL");
        lst.add("Nam");
        lst.add("Nong");
        model.addAttribute("xxx", lst);
        return "/list";
    }

}