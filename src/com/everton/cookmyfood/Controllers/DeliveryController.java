package com.everton.cookmyfood.Controllers;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.everton.cookmyfood.Aplicacao.CardapioAplicacao;
import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Aplicacao.DeliveryAplicacao;
import com.everton.cookmyfood.Aplicacao.ItemCardapioAplicacao;
import com.everton.cookmyfood.Aplicacao.PedidoAplicacao;
import com.everton.cookmyfood.Models.Cardapio;
import com.everton.cookmyfood.Models.Cliente;
import com.everton.cookmyfood.Models.Delivery;
import com.everton.cookmyfood.Models.ItemCardapio;
import com.everton.cookmyfood.Models.Pedido;

@Resource
public class DeliveryController {

	private final Result result;

	public DeliveryController(Result result) {
		this.result = result;
	}

	@Path("/pedidos")
	public List<Delivery> index() {
		DeliveryAplicacao app = new DeliveryAplicacao();
		return app.listar(new Delivery());
	}

	public void formulario() {
		Delivery d = new Delivery();

		Cliente c = new ClienteAplicacao().listar(new Cliente()).get(0);

		d.setCliente(c);

		DeliveryAplicacao app = new DeliveryAplicacao();
		app.salvar(d);

		result.redirectTo(this).alterar(d.getId());
	}

	@Path("/pedidos/{id}")
	public Delivery alterar(Long id) {

		List<Cardapio> cardapios = new CardapioAplicacao()
				.listar(new Cardapio());

		result.include("cardapios", cardapios);

		DeliveryAplicacao app = new DeliveryAplicacao();
		return app.consultarPorID(id);
	}

	@Post
	public void cadastrarItem(Long id, ItemCardapio item, Cardapio cardapio) {

		DeliveryAplicacao app = new DeliveryAplicacao();

		Delivery delivery = app.consultarPorID(id);

		ItemCardapioAplicacao aplicacao = new ItemCardapioAplicacao();

		aplicacao.salvar(item);

		item.setPedido(delivery);

		cardapio = new CardapioAplicacao().consultarPorID(cardapio.GetId());

		item.setCardapio(cardapio);

		app.salvar(delivery);

		aplicacao.salvar(item);

		result.redirectTo(this).alterar(id);
	}

	public void excluirItem(Long id) {

		ItemCardapioAplicacao app = new ItemCardapioAplicacao();

		ItemCardapio item = app.consultarPorID(id);

		id = item.getPedido().getId();

		app.remover(item);

		result.redirectTo(this).alterar(id);
	}

	public void excluir(Long id) {
		
		PedidoAplicacao app = new PedidoAplicacao();

		Pedido item = app.consultarPorID(id);

		if (item.getItensCardapio().size() > 0) {

			for (ItemCardapio cardapio : item.getItensCardapio()) {
				ItemCardapioAplicacao app2 = new ItemCardapioAplicacao();
				app2.remover(cardapio);
			}
		}

		app.remover(item);

		result.redirectTo(this).index();
	}
	
	public void pesquisar(Long id){
		PedidoAplicacao app = new PedidoAplicacao();

		Pedido item = app.consultarPorID(id);
		
		if (item != null) {
			result.redirectTo(this).alterar(id);
		}
		else
		{
			result.redirectTo(this).index();
			
		}
	}
}
