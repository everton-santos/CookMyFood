package com.everton.cookmyfood.Models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Usuario {

	private Double salario;
	
	@Column(unique=true)
	private String cpf;
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return String.format("Funcionario id = %d , nome = %s, cpf = %s",this.getId(), this.getNome(),  this.cpf);
	}
	
	
}
