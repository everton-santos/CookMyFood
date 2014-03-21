package com.everton.cookmyfood.models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Mesa extends AbstractModel{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private int numero;
	
	private int capacidade;
	
	@Override
	protected Serializable GetId() {
		return this.id;
	}

}
