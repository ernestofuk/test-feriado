package com.example.demo.service;

import com.example.demo.client.FeriadoClient;
import com.example.demo.client.dto.FeriadoDto;
import com.example.demo.dao.entity.Feriado;
import com.example.demo.dao.repository.FeriadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeriadoServiceImpl implements FeriadoService {

    private FeriadoRepository feriadoRepository;

    private FeriadoClient feriadoClient;

    public FeriadoServiceImpl(FeriadoRepository feriadoRepository,
                              FeriadoClient feriadoClient) {
        this.feriadoRepository = feriadoRepository;
        this.feriadoClient = feriadoClient;
    }

    @Override
    public void grabarFeriados() {

        feriadoClient.obtenerFeriado().stream().parallel().map(feriadoDto -> {
            Feriado feriado = feriadoDto.mapper(feriadoDto);
            feriadoRepository.save(feriado);
            return feriado;
        });

    }
}
