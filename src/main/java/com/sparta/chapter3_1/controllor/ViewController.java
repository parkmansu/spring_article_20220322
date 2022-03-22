package com.sparta.chapter3_1.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    @GetMapping("/api/memos/detail")
    public String getDetail(@RequestParam("id") Long id) {
        return "/detail.html";
    }
}
