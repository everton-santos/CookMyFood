package com.everton.cookmyfood.Models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PedidoTradicional extends Pedido {
	
	@ManyToOne
	@JoinColumn(name="id_mesa")
	private Mesa mesa;

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
	

}
