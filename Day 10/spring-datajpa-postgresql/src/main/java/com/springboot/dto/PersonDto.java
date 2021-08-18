package com.springboot.dto;

import com.springboot.entity.Address;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})

public class PersonDto {

    private Long id;
    @NotNull
    private String name;

    private String surname;

    private List<String> addresses;
}