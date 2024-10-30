package com.ratan.JournalApp.controller;

import com.ratan.JournalApp.entity.JournalEntry;
import com.ratan.JournalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    JournalEntryService journalService;

    @PostMapping("/")
    public String hello (@RequestBody JournalEntry entry) {

        journalService.saveEntry(entry);

        return "added";

    }


    @GetMapping("/")
    public String demo (){

        return "i'mm here ";
    }


}
