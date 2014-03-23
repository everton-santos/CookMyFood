package com.everton.cookmyfood.Models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Usuario {

	private Double salario;
	@Column(unique=true)
	private String cpf;
	
	
}
