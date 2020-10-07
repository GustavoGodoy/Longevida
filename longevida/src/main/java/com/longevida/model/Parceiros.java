package com.longevida.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Parceiros {
	
	@Id
	@Column(name="id_parceiro")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name="nome_parceiro")
	@NotNull
	private String nomeParceiro;
	
	@Column(name="cnpj_parceiro")
	@NotNull
	private long cnpjParceiro;
	
	@Column(name="dados_parceiro")
	@NotNull
	private String dadosBancarios;
	
	@Column(name="data_parceiro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataParceiro = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeParceiro() {
		return nomeParceiro;
	}

	public void setNomeParceiro(String nomeParceiro) {
		this.nomeParceiro = nomeParceiro;
	}

	public long getCnpjParceiro() {
		return cnpjParceiro;
	}

	public void setCnpjParceiro(long cnpjParceiro) {
		this.cnpjParceiro = cnpjParceiro;
	}

	public String getDadosBancarios() {
		return dadosBancarios;
	}

	public void setDadosBancarios(String dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	public Date getDataParceiro() {
		return dataParceiro;
	}

	public void setDataParceiro(Date dataParceiro) {
		this.dataParceiro = dataParceiro;
	}

	
}
