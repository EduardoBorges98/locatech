package br.com.fiap.locatech.locatech.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AluguelRequestDTO(
        @Schema(description = "ID da pessoa")
        @NotNull(message = "ID PESSOA não pode ser nulo")
        Long pessoaId,
        @NotNull(message = "ID VEICULO não pode ser nulo")
        Long veiculoId,
        //@NotNull(message = "DATA não pode ser nulo")
        LocalDate dataInicio,
        //@NotNull(message = "DATA não pode ser nulo")
        LocalDate dataFim) {


}
