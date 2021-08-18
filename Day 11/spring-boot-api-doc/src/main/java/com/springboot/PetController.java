package com.springboot;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pet")
@Api(value = "My Pet Api Documentation")

public class PetController {

    private final List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init(){
        petList.add(new Pet(1,"Test Pet",new Date()));

    }

    @PostMapping
    @ApiOperation(value = "Add New Pet", notes = "Use this carefully")
    public ResponseEntity<Pet> save(@RequestBody @ApiParam(value = "Animal") Pet pet) {
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    @ApiOperation(value = "Pet List", notes = "This method lists all")
    public ResponseEntity<List<Pet>> listAll() {
        return ResponseEntity.ok(petList);
    }

}
