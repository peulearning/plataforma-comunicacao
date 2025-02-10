package com.agendamento.magalu.business.mapper;

import com.agendamento.magalu.business.AgendamentoService;
import com.agendamento.magalu.infra.entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IAgendamentoMapper {
    Agendamento paraEntity(AgendamentoService agendamento);
    Agendamento paraOut (Agendamento agendamento);

    @Mapping(target = "dataHoraModificacao", expression = "java(LocalDateTime.now())")
    @Mapping(target = "statusNotificacao", expression = "java(StatusNotificacaoEnum.CANCELADO")
    Agendamento paraEntityCancelamento(Agendamento agendamento);
}
