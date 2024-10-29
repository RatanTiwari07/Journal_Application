package com.ratan.JournalApp.service;

import com.ratan.JournalApp.entity.JournalEntry;
import com.ratan.JournalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalRepo;

    public boolean saveEntry (JournalEntry entry) {

        journalRepo.save(entry);

        return true;

    }

}
