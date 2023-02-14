package ru.nevredimov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WatchController {

    @GetMapping("/watch")
    public String watch() {
        return "third/watch";
    }
}
