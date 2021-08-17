package com.springboot.entity;

import java.util.Date;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Document(indexName = "people")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    private String id;
    @Field(name = "name", type = FieldType.Text)
    private String name;
    @Field(name = "surname", type = FieldType.Text)
    private String surname;
    @Field(name = "location", type = FieldType.Text)
    private String location;
    @Field(name = "birthdate", type = FieldType.Date)
    private Date birthdate;
}
