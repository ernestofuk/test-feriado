package com.example.demo.controller;

import com.example.demo.service.FeriadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feriado")
public class FeriadoController {

    private FeriadoService feriadoService;

    @GetMapping("/grabar")
    public void grabarFeriados() {
        feriadoService.grabarFeriados();
    }
}
