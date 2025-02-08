package com.agendamento.magalu.business;

import com.agendamento.magalu.business.mapper.IAgendamentoMapper;
import com.agendamento.magalu.infra.entities.Agendamento;
import com.agendamento.magalu.infra.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private  AgendamentoRepository repository;
    private  IAgendamentoMapper agendamentoMapper;

    public Agendamento gravarAgendamento(AgendamentoService agendamento){
        return agendamentoMapper.paraOut(
                repository.save(
                        agendamentoMapper.paraEntity(agendamento)));
    }
}
