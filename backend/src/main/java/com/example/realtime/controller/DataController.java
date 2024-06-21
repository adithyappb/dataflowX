package com.example.realtime.controller;

import com.example.realtime.model.DataRecord;
import com.example.realtime.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/data")
    public Flux<DataRecord> getData() {
        return dataService.getAllData();
    }
}
