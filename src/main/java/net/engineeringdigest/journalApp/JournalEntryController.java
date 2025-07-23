package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    Map<Long,JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping()
    public boolean createEntry(@RequestBody JournalEntry myEntry){
         journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }
    @GetMapping("/id/{myId}")
    public JournalEntry getJournalDetailsByID(@PathVariable Long myId){
        return journalEntries.get(myId);
    }
    @DeleteMapping("/id/{myId}")
    public boolean deleteByID(@PathVariable Long myId){
        journalEntries.remove(myId);
        return true;

    }
    @PutMapping("/id/{myId}")
    public JournalEntry changeDetailsByID(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
         journalEntries.put(myId,myEntry);
         return myEntry;
    }
}
