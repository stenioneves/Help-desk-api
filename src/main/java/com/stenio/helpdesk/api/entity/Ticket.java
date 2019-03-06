package com.stenio.helpdesk.api.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.stenio.helpdesk.api.enums.PrioridadeEnum;
import com.stenio.helpdesk.api.enums.StatusEnum;

@Document
public class Ticket {
	
	
	@Id
	private String id;
	
	@DBRef(lazy= true)
	private Usuario usuario;
	
	private Date data;
	
	private String titulo;
	
	private Integer numero;
	
	private StatusEnum  status;
	
	private PrioridadeEnum prioridade;
	
	private  String descricao;
	
	@DBRef(lazy= true)
	private Usuario usuarioDesignado;
	
	private String  image;
	
	private  List<AlteracaoStatus> alteracoes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public PrioridadeEnum getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(PrioridadeEnum prioridade) {
		this.prioridade = prioridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuarioDesignado() {
		return usuarioDesignado;
	}

	public void setUsuarioDesignado(Usuario usuarioDesignado) {
		this.usuarioDesignado = usuarioDesignado;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<AlteracaoStatus> getAlteracoes() {
		return alteracoes;
	}

	public void setAlteracoes(List<AlteracaoStatus> alteracoes) {
		this.alteracoes = alteracoes;
	}	

	
}
