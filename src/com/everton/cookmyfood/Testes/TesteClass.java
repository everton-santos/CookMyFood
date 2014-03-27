package com.everton.cookmyfood.Testes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.everton.cookmyfood.Aplicacao.CardapioAplicacao;
import com.everton.cookmyfood.Aplicacao.CategoriaAplicacao;
import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Aplicacao.DeliveryAplicacao;
import com.everton.cookmyfood.Aplicacao.FuncionarioAplicacao;
import com.everton.cookmyfood.Aplicacao.ItemCardapioAplicacao;
import com.everton.cookmyfood.Aplicacao.MesaAplicacao;
import com.everton.cookmyfood.Models.Cardapio;
import com.everton.cookmyfood.Models.Categoria;
import com.everton.cookmyfood.Models.Cliente;
import com.everton.cookmyfood.Models.Delivery;
import com.everton.cookmyfood.Models.Funcionario;
import com.everton.cookmyfood.Models.ItemCardapio;
import com.everton.cookmyfood.Models.Mesa;
import com.everton.cookmyfood.Models.StatusPedido;

public class TesteClass {
	public static void main(String[] args) {

		manterCategoria();

		manterCardapio();

		manterMesa();

		manterFuncionario();

		manterCliente();

		inserirCardapios();

		inserirItensCardapios();

		efetuarPedidoDelivery();

		efetuarPedidoTradiconal();
	}

	private static void manterCategoria() {
		Categoria c = new Categoria();
		c.setNome("bebidas");

		Categoria c2 = new Categoria();
		c2.setNome("bebidas-alcolicas");

		Categoria c3 = new Categoria();
		c3.setNome("acompanhamentos");

		CategoriaAplicacao app = new CategoriaAplicacao();
		app.salvar(c);
		app.salvar(c2);
		app.salvar(c3);

		Long id = c.getId();

		Categoria consulta = app.consultarPorID(id);

		System.out.println(consulta.toString());

		consulta.setNome("comidas");
		app.salvar(consulta);

		System.out.println(consulta.toString());

		Categoria exclusao = new Categoria();
		exclusao.setId(id);
		app.remover(exclusao);

		List<Categoria> lista = app.listar(new Categoria());

		System.out.println("Listar categorias");
		for (Categoria cat : lista) {
			System.out.println(cat.toString());
		}

	}

	private static void manterCardapio() {
		Cardapio c = new Cardapio();
		c.setNome("hamburger");
		c.setPreco(4.50);

		CardapioAplicacao app = new CardapioAplicacao();
		app.salvar(c);

		Long id = c.getId();

		Cardapio consulta = app.consultarPorID(id);

		System.out.println(String.format(
				"cardapio consultada  id = %d , descricao = %s",
				consulta.getId(), consulta.getNome()));

		consulta.setNome("comidas");
		app.salvar(consulta);

		System.out.println(String.format(
				"cardapio atualizada  id = %d , descricao = %s",
				consulta.getId(), consulta.getNome()));

		Cardapio exclusao = new Cardapio();
		exclusao.setId(id);
		app.remover(exclusao);

	}

	private static void manterMesa() {
		Mesa c = new Mesa();
		c.setCapacidade(3);
		c.setNumero(10);

		MesaAplicacao app = new MesaAplicacao();
		app.salvar(c);

		Long id = c.getId();

		Mesa consulta = app.consultarPorID(id);

		System.out.println(String.format(
				"Mesa consultada  id = %d , capacidade = %s", consulta.getId(),
				consulta.getCapacidade()));

		consulta.setNumero(8);
		consulta.setCapacidade(6);
		app.salvar(consulta);

		System.out.println(String.format(
				"Mesa atualizada  id = %d , capacidade = %s", consulta.getId(),
				consulta.getCapacidade()));

		Mesa exclusao = new Mesa();
		exclusao.setId(id);
		app.remover(exclusao);

	}

	private static void manterFuncionario() {
		Funcionario obj = new Funcionario();
		obj.setCelular("9999-0000");
		obj.setEmail("everton@mail.com");
		obj.setLoginName("funcionario1");
		obj.setLoginPass("123");
		obj.setNome("Everton");
		obj.setSalario(500D);
		obj.setCpf("12355");

		Funcionario obj2 = new Funcionario();
		obj2.setCelular("9999-0000");
		obj2.setEmail("func2@mail.com");
		obj2.setLoginName("funcionario2");
		obj2.setLoginPass("123");
		obj2.setNome("teste2 nome");
		obj2.setSalario(502D);
		obj2.setCpf("1235sadf5");

		Funcionario obj3 = new Funcionario();
		obj3.setCelular("9999-0000");
		obj3.setEmail("func3@mail.com");
		obj3.setLoginName("funcionario3");
		obj3.setLoginPass("123");
		obj3.setNome("funcionario3 nome");
		obj3.setSalario(600D);
		obj3.setCpf("12sew355");

		FuncionarioAplicacao app = new FuncionarioAplicacao();

		app.salvar(obj);
		app.salvar(obj2);
		app.salvar(obj3);

		Long id = obj.getId();

		Funcionario consulta = app.consultarPorID(id);

		obj.setLoginName("teste");
		obj.setLoginPass("123");
		obj.setNome("Funcionario nome");
		app.salvar(consulta);

		Funcionario exclusao = new Funcionario();
		exclusao.setId(id);
		app.remover(exclusao);

		List<Funcionario> lista = app.listar(new Funcionario());

		System.out.println("Listar funcionarios");
		for (Funcionario cat : lista) {
			System.out.println(cat.toString());
		}

	}

	private static void manterCliente() {
		Cliente c = new Cliente();
		c.setCelular("9999-0000");
		c.setEmail("everton@mail.com");
		c.setLoginName("evertonCliente");
		c.setLoginPass("123");
		c.setNome("Everton cliente");

		Cliente c2 = new Cliente();
		c2.setCelular("9999-0000");
		c2.setEmail("everton@mail.com");
		c2.setLoginName("evertonCliente2");
		c2.setLoginPass("123");
		c2.setNome("Everton cliente");

		ClienteAplicacao app = new ClienteAplicacao();
		app.salvar(c);

		Long id = c.getId();

		Cliente consulta = app.consultarPorID(id);

		c.setLoginName("teste");
		c.setLoginPass("123");
		c.setNome("Funcionario nome");
		app.salvar(consulta);

		Cliente exclusao = new Cliente();
		exclusao.setId(id);
		app.remover(exclusao);

	}

	private static void inserirCardapios() {

		Cardapio obj1 = new Cardapio();
		obj1.setNome("Coca");
		obj1.setPreco(5);
		obj1.setCategoria(new CategoriaAplicacao().listar(new Categoria()).get(
				0));

		Cardapio obj2 = new Cardapio();
		obj2.setNome("BataFrita");
		obj2.setPreco(5);
		obj2.setCategoria(new CategoriaAplicacao().listar(new Categoria()).get(
				0));

		Cardapio obj3 = new Cardapio();
		obj3.setNome("Hamburger");
		obj3.setPreco(5);
		obj3.setCategoria(new CategoriaAplicacao().listar(new Categoria()).get(
				0));

		CardapioAplicacao app = new CardapioAplicacao();
		app.salvar(obj1);
		app.salvar(obj2);
		app.salvar(obj3);

	}

	private static void inserirItensCardapios() {

	}

	private static void efetuarPedidoDelivery() {

		// setar ids
		Long idFunc = 3L;

		List<ItemCardapio> itens = new ArrayList<ItemCardapio>();

		ItemCardapio i1 = new ItemCardapio();
		i1.setCardapio(new CardapioAplicacao().listar(new Cardapio()).get(0));
		i1.setPreco(5);
		i1.setQuantidade(2);

		ItemCardapio i2 = new ItemCardapio();
		i2.setCardapio(new CardapioAplicacao().listar(new Cardapio()).get(0));
		i2.setPreco(5);
		i2.setQuantidade(2);

		ItemCardapio i3 = new ItemCardapio();
		i3.setCardapio(new CardapioAplicacao().listar(new Cardapio()).get(0));
		i3.setPreco(5);
		i3.setQuantidade(2);

		ItemCardapio i4 = new ItemCardapio();
		i4.setCardapio(new CardapioAplicacao().listar(new Cardapio()).get(0));
		i4.setPreco(5);
		i4.setQuantidade(2);

		itens.add(i1);
		itens.add(i2);
		itens.add(i3);
		itens.add(i4);

		Delivery d = new Delivery();
		d.setData(new Date());
		d.setStatus(StatusPedido.EmConsumo);
		d.setTrocoPara(50);
		d.setItensCardapio(itens);

		Delivery d2 = new Delivery();
		d2.setData(new Date());
		d2.setStatus(StatusPedido.EmConsumo);
		d2.setTrocoPara(50);

		itens.remove(0);
		d2.setItensCardapio(itens);

		Funcionario f = new FuncionarioAplicacao().getUsuarioAutorizado(
				"funcionario3", "123");

		d.setFuncionario(f);
		d2.setFuncionario(f);

		d.setCliente(new ClienteAplicacao().listar(new Cliente()).get(0));
		d2.setCliente(new ClienteAplicacao().listar(new Cliente()).get(0));

		DeliveryAplicacao app = new DeliveryAplicacao();
		app.salvar(d);
		app.salvar(d2);

	}

	private static void efetuarPedidoTradiconal() {

	}

}
