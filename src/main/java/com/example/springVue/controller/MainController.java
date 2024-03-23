package com.example.springVue.controller;


import com.example.springVue.entity.Item;
import com.example.springVue.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {


    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/api/items")
    public List<Item> getItem() {
        List<Item> items = (List<Item>) itemRepository.findAll();
        return items;
    }
}
