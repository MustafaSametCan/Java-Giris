package com.springboot.rc.api;

import com.springboot.rc.model.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/test")

public class RestClientController {

    private static final String webUrl = "http://localhost:8081/person";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<PersonDto>> getPersonList() {
        ResponseEntity<List> result = restTemplate.getForEntity(webUrl, List.class);
        List<PersonDto> responseBody = result.getBody();
        return ResponseEntity.ok(responseBody);
    }
    @PostMapping
    public ResponseEntity<PersonDto> save(@RequestBody PersonDto personDto){
        ResponseEntity<PersonDto> result = restTemplate.postForEntity(webUrl, personDto, PersonDto.class);
        PersonDto responseBody = result.getBody();
        return ResponseEntity.ok(responseBody);
    }

}
