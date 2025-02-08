package com.agendamento.magalu.controller;

import com.agendamento.magalu.business.AgendamentoService;
import com.agendamento.magalu.controller.out.AgendamentoRecordOut;
import com.agendamento.magalu.infra.entities.Agendamento;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private  AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<Agendamento> gravarAgendamento(@RequestBody AgendamentoService agendamento){
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));
    }
}
