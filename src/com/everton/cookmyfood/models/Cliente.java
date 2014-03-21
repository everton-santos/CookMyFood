package com.everton.cookmyfood.models;

import java.util.Collection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Usuario {

	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy="cliente")
	private Collection<Delivery> pedidosDelivery;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
