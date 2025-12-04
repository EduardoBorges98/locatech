package br.com.fiap.locatech.locatech.dtos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AluguelRequestDTO(
        @NotNull(message = "ID PESSOA não pode ser nulo")
        Long pessoaId,
        @NotNull(message = "ID VEICULO não pode ser nulo")
        Long veiculoId,
        //@NotNull(message = "DATA não pode ser nulo")
        LocalDate dataInicio,
        //@NotNull(message = "DATA não pode ser nulo")
        LocalDate dataFim) {


}
