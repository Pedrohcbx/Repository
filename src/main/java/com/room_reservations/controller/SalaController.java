package com.room_reservations.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/salas")
@Tag(name = "Salas", description = "Gerenciamento de salas")
public class SalaController {


    @GetMapping
    public String listarTodas() {
        return "Rota Funcionando";
    }
}
