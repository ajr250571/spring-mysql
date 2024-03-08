package com.foxy.springmysql.dtos;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SampleDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private Date birthdate;
}
