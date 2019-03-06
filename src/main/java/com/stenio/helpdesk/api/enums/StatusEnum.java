package com.stenio.helpdesk.api.enums;

public enum StatusEnum {

	Novo,
	Designado,
	Resolvido,
	Aprovado,
	Desaprovado,
	Fechado;


	public static StatusEnum getStatus(String status) {
		switch (status) {
		case "Novo":return Novo;
		case "Designado":return Designado;
		case "Resolvido":return Resolvido;
		case "Aprovado":return Aprovado;
		case "Desaprovado":return Desaprovado;
		case "Fechado":return Fechado;

		default:return Novo;

		}


	}

}
