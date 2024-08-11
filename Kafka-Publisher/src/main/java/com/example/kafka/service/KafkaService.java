package com.example.kafka.service;

import com.example.kafka.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, Customer> kafkaTemplate;

    public void publish(Customer customer) {
        kafkaTemplate.send("customer-topic", customer);
    }
}
