package com.example.demo.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class Feriado {

    @Id
    private Integer id;

    @Column
    private LocalDate date;

    @Column
    private String title;

    @Column
    private String extra;
}
