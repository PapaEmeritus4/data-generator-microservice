package org.example.datageneratormicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.example.datageneratormicroservice.model.Data;
import org.example.datageneratormicroservice.service.KafkaDataService;
import org.example.datageneratormicroservice.web.dto.DataDto;
import org.example.datageneratormicroservice.web.mapper.DataMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap1/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final DataMapper dataMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

}
