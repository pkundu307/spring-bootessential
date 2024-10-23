package com.journal.service;

import com.journal.entity.JournalEntry;
import com.journal.Repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class JournalEntryService {
@Autowired
private JournalEntryRepository journalEntryRepository;


public void createJournal(JournalEntry journalEntry){
    journalEntryRepository.save(journalEntry);
}
}