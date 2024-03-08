package com.foxy.springmysql.Entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "sampleentity")
public class SampleEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sampleentity_sequence")
    @SequenceGenerator(name = "sampleentity_sequence", sequenceName = "sampleentity_sequence", allocationSize = 100)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private Date birthdate;

}