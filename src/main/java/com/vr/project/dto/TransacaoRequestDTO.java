package com.vr.project.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoRequestDTO {

	private String numeroCartao;
	private String senha;
	private BigDecimal valor;
	@JsonIgnore
	private Instant dataTransacao = Instant.now();
}
