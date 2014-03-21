package com.everton.cookmyfood.models;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Reserva extends AbstractModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Calendar dataInicial;
	private Calendar dataFinal;
	private int numeroPessoas;
	private String nomeResponsavel;

	@Override
	protected Serializable GetId() {
		return this.id;
	}

}
