package com.everton.cookmyfood.Models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
public class Pedido extends AbstractModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data;

	private StatusPedido status;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST)
	private Collection<ItemCardapio> itensCardapio;

	@ManyToOne
	private Funcionario funcionario;


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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Collection<ItemCardapio> getItensCardapio() {
		return itensCardapio;
	}

	public void setItensCardapio(Collection<ItemCardapio> itensCardapio) {
		this.itensCardapio = itensCardapio;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
