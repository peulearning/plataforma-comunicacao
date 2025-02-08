package com.agendamento.magalu.controller.out;

import com.agendamento.magalu.infra.enums.StatusNotificacaoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record AgendamentoRecordOut(Long id,
                                   String emailDestinatario,
                                   String telefoneDestinatario,
                                   String mensagem,
                                   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyyy HH:mm:ss")
                                   LocalDateTime dataHoraEnvio,
                                   StatusNotificacaoEnum statusNotificacao) {
}
