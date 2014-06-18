package com.everton.cookmyfood.Models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemCardapio extends AbstractModel {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private int quantidade;
	
	private double preco;
	
	@ManyToOne
	@JoinColumn(name="id_pedido")
	private Pedido pedido;

	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_cardapio")
	private Cardapio cardapio;
	
	@Override
	public Serializable GetId() {
		return this.id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
	
	
	
}
