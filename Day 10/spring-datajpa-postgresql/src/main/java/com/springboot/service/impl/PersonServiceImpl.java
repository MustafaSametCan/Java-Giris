package com.springboot.service.impl;

import com.springboot.dto.PersonDto;
import com.springboot.entity.Address;
import com.springboot.entity.Person;
import com.springboot.repo.AddressRepository;
import com.springboot.repo.PersonRepository;
import com.springboot.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    @Override
    @Transactional
    public PersonDto save(PersonDto personDto) {
        Assert.notNull(personDto.getName(), "Enter a name");

        Person person = new Person();
        person.setName(personDto.getName());
        person.setSurname(personDto.getSurname());
        final Person persondb = personRepository.save(person);
        List<Address> list = new ArrayList<>();
        personDto.getAddresses().forEach(item -> {
            Address address = new Address();
            address.setAddress(item);
            address.setAddressType(Address.AddressType.OTHER);
            address.setOnline(true);
            address.setPerson(persondb);
            list.add(address);
        });
        addressRepository.saveAll(list);
        personDto.setId(persondb.getId());
        return personDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public PersonDto getAll(PersonDto personDto) {
        return null;
    }

    @Override
    public List<PersonDto> getAll() {
        return null;
    }


    @Override
    public Page<PersonDto> getAll(Pageable pageable) {
        return null;
    }
}
