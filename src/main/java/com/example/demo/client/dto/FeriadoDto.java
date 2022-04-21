package com.example.demo.client.dto;

import com.example.demo.dao.entity.Feriado;
import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
public class FeriadoDto {

    @Column
    private LocalDate date;

    @Column
    private String title;

    @Column
    private String extra;

    public Feriado mapper(FeriadoDto feriadoDto) {
        Feriado feriado = new Feriado();
        feriado.setDate(feriadoDto.getDate());
        feriado.setTitle(feriadoDto.getTitle());
        feriado.setExtra(feriadoDto.getExtra());
        return feriado;
    }
}
