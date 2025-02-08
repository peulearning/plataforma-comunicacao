package com.agendamento.magalu.infra.entities;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Table(name = "Agendamento")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String emailDestinatario;
    private String telefoneDestinatario;
    private LocalDateTime dataHoraEnvio;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraModificacao;
    private String mensagem;


    @PrePersist
    private void prePersist(){
        dataHoraAgendamento = LocalDateTime.now();
    }
}
