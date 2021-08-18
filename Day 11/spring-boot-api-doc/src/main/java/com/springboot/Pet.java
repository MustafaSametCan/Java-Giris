package com.springboot;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "My Pet Object", description = "My Pet")
public class Pet {
    @ApiModelProperty(value = "Pet Object Single Id")
    private int id;
    @ApiModelProperty(value = "Pet Object Single Name")
    private String name;
    @ApiModelProperty(value = "Pet Object Single Date")
    private Date date;
}
