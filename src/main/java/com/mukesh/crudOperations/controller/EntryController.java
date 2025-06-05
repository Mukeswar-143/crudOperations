package com.mukesh.crudOperations.controller;

import com.mukesh.crudOperations.entity.Entry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Entry")
public class EntryController {

    private Map<Long , Entry> Entries  = new HashMap<>();

    @GetMapping
    public List<Entry> getAll() {
        return new ArrayList<>(Entries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody Entry my_entry) {
        Entries.put(my_entry.getId(), my_entry);
        return true;
    }

    @GetMapping("id/{my_id}")
    public Entry getEntryById(@PathVariable long my_id){
       return Entries.get(my_id);
    }

    @DeleteMapping("id/{id}")
    public Entry deleteEntryById(@PathVariable long id){
        return Entries.remove(id);
    }

    @PutMapping("id/{id}")
    public Entry updateEntryByid(@PathVariable long id,@RequestBody Entry my_entry){
        return Entries.put(id,my_entry);
    }
}
