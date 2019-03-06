package com.stenio.helpdesk.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.stenio.helpdesk.api.enums.StatusEnum;

@Document
public class AlteracaoStatus {
	
	@Id
	private String id;
	
	@DBRef
	private  Ticket ticket;
	
	@DBRef
	private Usuario alteracaoUsuario;
	
	private Date dataAlteracaoStatus;
	
	private  StatusEnum status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Usuario getAlteracaoUsuario() {
		return alteracaoUsuario;
	}

	public void setAlteracaoUsuario(Usuario alteracaoUsuario) {
		this.alteracaoUsuario = alteracaoUsuario;
	}

	public Date getDataAlteracaoStatus() {
		return dataAlteracaoStatus;
	}

	public void setDataAlteracaoStatus(Date dataAlteracaoStatus) {
		this.dataAlteracaoStatus = dataAlteracaoStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
	
	

}
