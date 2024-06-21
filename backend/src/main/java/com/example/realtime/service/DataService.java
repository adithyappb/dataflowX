package com.example.realtime.service;

import com.example.realtime.model.DataRecord;
import com.example.realtime.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public Flux<DataRecord> getAllData() {
        return dataRepository.findAll();
    }
}
