package com.agendamento.magalu.infra.repositories;

import com.agendamento.magalu.infra.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
