package com.everton.cookmyfood.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Delivery extends Pedido {
	
	private double trocoPara;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	public double getTrocoPara() {
		return trocoPara;
	}

	public void setTrocoPara(double trocoPara) {
		this.trocoPara = trocoPara;
	}

}
