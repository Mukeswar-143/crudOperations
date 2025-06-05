package com.mukesh.crudOperations.controller;

import com.mukesh.crudOperations.entity.Entry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/entry")
public class EntryControllerV2 {


    @GetMapping
    public List<Entry> getAll() {
       return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody Entry my_entry) {

        return true;
    }

    @GetMapping("id/{my_id}")
    public Entry getEntryById(@PathVariable long my_id){
       return null;
    }

    @DeleteMapping("id/{id}")
    public Entry deleteEntryById(@PathVariable long id){
        return null;
    }

    @PutMapping("id/{id}")
    public Entry updateEntryByid(@PathVariable long id,@RequestBody Entry my_entry){
       return null;
    }
}
