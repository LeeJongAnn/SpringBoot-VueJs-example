package com.example.springVue;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {


    @GetMapping("/api/items")
    public List<String> getItem() {
        List<String> item = new ArrayList<>();

        item.add("alpha");
        item.add("omega");
        item.add("gamma");

        return item;
    }
}
