package com.vr.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vr.project.model.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Integer>{

	public Optional<Cartao> findByNumeroCartao(String numeroCartao);
}
