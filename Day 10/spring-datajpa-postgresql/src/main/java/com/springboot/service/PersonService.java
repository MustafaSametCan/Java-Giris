package com.springboot.service;

import com.springboot.dto.PersonDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonService {

    PersonDto save(PersonDto personDto);

    void delete(Long id);

    PersonDto getAll(PersonDto personDto);

    List<PersonDto> getAll();

    Page<PersonDto> getAll(Pageable pageable);
}
