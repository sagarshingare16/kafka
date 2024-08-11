package com.example.kafka.restController;

import com.example.kafka.model.Customer;
import com.example.kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaRestController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/publish")
    public String publish(@RequestBody Customer customer) {
        kafkaService.publish(customer);
        return "Published successfully";
    }
}
