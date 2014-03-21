package com.everton.cookmyfood.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario extends AbstractModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String loginName;
	private String loginPass;
	private String Nome;
	private String Email;
	private String Telefone;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getLoginName() {
		return loginName;
	}



	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}



	public String getLoginPass() {
		return loginPass;
	}



	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}



	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getTelefone() {
		return Telefone;
	}



	public void setTelefone(String telefone) {
		Telefone = telefone;
	}



	@Override
	protected Serializable GetId() {
		return this.id;
	}

}
