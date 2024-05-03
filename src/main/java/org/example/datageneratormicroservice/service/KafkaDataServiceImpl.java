package org.example.datageneratormicroservice.service;

import lombok.RequiredArgsConstructor;
import org.example.datageneratormicroservice.model.Data;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;


@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final KafkaSender<String, Object> sender;

    @Override
    public void send(Data data) {

    }
}
