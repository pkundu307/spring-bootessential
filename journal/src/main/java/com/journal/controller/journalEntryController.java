package com.journal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.journal.entity.journalEntry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class journalEntryController {
   private Map<Long,journalEntry>journalEntries = new HashMap<>();

   @GetMapping("/ppp")
   public List<journalEntry> getAll(){
       return new ArrayList<>(journalEntries.values());
   }


    @PostMapping
    public ResponseEntity<String> createEntry(@RequestBody journalEntry myEntry) {
        journalEntries.put(myEntry.getId(), myEntry);
        return new ResponseEntity<>("Entry created successfully", HttpStatus.CREATED); // 201 Created
    }

    @GetMapping("/id/{myid}")
    public journalEntry getbyid(@PathVariable Long myid){
       return journalEntries.get(myid);

   }
    @DeleteMapping("/id/{myid}")
    public journalEntry deletebyid(@PathVariable Long myid){
        return journalEntries.remove(myid);

    }
    @PutMapping("/id/{myid}")
    public journalEntry updateJournal(@PathVariable Long myid,@RequestBody journalEntry myEntry){
       journalEntries.put(myid,myEntry);

       return journalEntries.get(myid);
    }
}
