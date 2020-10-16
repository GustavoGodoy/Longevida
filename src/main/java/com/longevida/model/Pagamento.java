package com.longevida.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_pagamento")
public class Pagamento {
	
	@Id
	@Column(name = "id_pagamento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idPagamento;
	
	@Column(name = "forma_pagamento")
	@NotNull
	private String formaPagamento;
	
	@Column(name = "valor_pagamento")
	@NotNull
	private double valorTotal;
	
	@Column(name = "cartao_pagamento")
	@NotNull
	private String cartaoPagamento;
	
	@Column(name = "boleto_pagamento")
	@NotNull
	private String boletoPagamento;

	@ManyToOne
	@JsonIgnoreProperties("pagamentos")
	private Usuario usuario;
	
	@ManyToOne
	@JsonIgnoreProperties("pagamentos")
	private Produtos produto;

	public long getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(long idPagamento) {
		this.idPagamento = idPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getCartaoPagamento() {
		return cartaoPagamento;
	}

	public void setCartaoPagamento(String cartaoPagamento) {
		this.cartaoPagamento = cartaoPagamento;
	}

	public String getBoletoPagamento() {
		return boletoPagamento;
	}

	public void setBoletoPagamento(String boletoPagamento) {
		this.boletoPagamento = boletoPagamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}
	
	
	
}