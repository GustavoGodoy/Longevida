package com.longevida.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Usuario {

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nome_usuario")
	@NotNull
	private String nomeUsuario;
	
	@Column(name="email_usuario")
	@NotNull
	private String emailUsuario;
	
	@Column(name="sexo_usuario")
	@NotNull
	@Size(min =1, max =20)
	private String sexoUsuario;
	
	@Column(name="telefone_usuario")
	@NotNull
	@Size(min =1, max =20)
	private String telefoneUsuario;
	
	@Column(name="cpf_usuario")
	@NotNull
	@Size(min =1, max =11)
	private long cpfUsuario;
	
	@Column(name="login_usuario")
	@NotNull
	@Size(min =5, max =110)
	private String loginUsuario;
	
	@Column(name="senha_usuario")
	@NotNull
	@Size(min =8)
	private String senhaUsuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_usuario = new java.sql.Date(System.currentTimeMillis());
	
	@OneToMany(mappedBy ="usuario",cascade=CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Pagamento> pagamentos;


	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSexoUsuario() {
		return sexoUsuario;
	}

	public void setSexoUsuario(String sexoUsuario) {
		this.sexoUsuario = sexoUsuario;
	}

	public String getTelefoneUsuario() {
		return telefoneUsuario;
	}

	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	public long getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(long cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Date getData_usuario() {
		return data_usuario;
	}

	public void setData_usuario(Date data_usuario) {
		this.data_usuario = data_usuario;
	}


	
}

