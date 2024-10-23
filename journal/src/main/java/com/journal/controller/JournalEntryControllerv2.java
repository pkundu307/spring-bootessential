package com.journal.controller;


import com.journal.entity.JournalEntry;
import com.journal.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal2")
public class JournalEntryControllerv2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping("/ok")
    public String ok(){

        return "ok";
    }
    @PostMapping("/add")
    public String addJournal(@RequestBody  JournalEntry myEntry){
        journalEntryService.createJournal(myEntry);
        System.out.println(myEntry);
        return "journal added";
    }
}
