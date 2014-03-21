package com.everton.cookmyfood.models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ItemCardapio extends AbstractModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private int quantidade;
	
	private double preco;
	
	@ManyToOne
	@JoinColumn(name="id_pedido")
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name="id_cardapio")
	private Cardapio cardapio;
	
	@Override
	protected Serializable GetId() {
		return this.id;
	}
	
	
}
