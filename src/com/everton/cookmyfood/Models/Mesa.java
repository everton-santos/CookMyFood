package com.everton.cookmyfood.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mesa extends AbstractModel{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private int numero;
	
	private int capacidade;
	
	@Override
	public Serializable GetId() {
		return this.id;
	}

}
