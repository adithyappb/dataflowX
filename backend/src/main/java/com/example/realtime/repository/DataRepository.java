package com.example.realtime.repository;

import com.example.realtime.model.DataRecord;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends ReactiveMongoRepository<DataRecord, String> {
}
