package com.agendamento.magalu.business;

import com.agendamento.magalu.business.mapper.IAgendamentoMapper;
import com.agendamento.magalu.infra.entities.Agendamento;
import com.agendamento.magalu.infra.exceptions.NotFoundException;
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

    public Agendamento buscarAgendamentosPorId(Long id) {
        return agendamentoMapper.paraOut(repository.findById(id).orElseThrow(() -> new NotFoundException("ID não encontrado")));
    }

    public void cancelarAgendamento(Long id){
        Agendamento agendamento = repository.findById(id).orElseThrow(() -> new NotFoundException("Id não encontrado"));
        repository.save(
                agendamentoMapper.paraEntityCancelamento((agendamento))
        );
    }
}
