package com.example.demo.client;

import com.example.demo.client.dto.FeriadoDto;
import com.example.demo.config.FeriadoClienConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "${feriados.url}", configuration = FeriadoClienConfig.class)
public interface FeriadoClient {

    @GetMapping(value = "/feriados", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<FeriadoDto> obtenerFeriado();
}
