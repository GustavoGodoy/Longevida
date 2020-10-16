package com.longevida.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.longevida.model.Pagamento;

public interface PagamentosRepository extends JpaRepository<Pagamento, Long> {
	

}
