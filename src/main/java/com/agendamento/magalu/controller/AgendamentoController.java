package com.agendamento.magalu.controller;

import com.agendamento.magalu.business.AgendamentoService;
import com.agendamento.magalu.infra.entities.Agendamento;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private  AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<Agendamento> gravarAgendamento(@RequestBody AgendamentoService agendamento){
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));
    }

    @GetMapping
    public ResponseEntity<Agendamento> buscarAgendamentoPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(agendamentoService.buscarAgendamentosPorId(id));
    }
}
