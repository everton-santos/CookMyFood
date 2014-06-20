package com.everton.cookmyfood.Controllers;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.everton.cookmyfood.Aplicacao.CardapioAplicacao;
import com.everton.cookmyfood.Aplicacao.ItemCardapioAplicacao;
import com.everton.cookmyfood.Aplicacao.MesaAplicacao;
import com.everton.cookmyfood.Aplicacao.PedidoAplicacao;
import com.everton.cookmyfood.Aplicacao.PedidoTradicionalAplicacao;
import com.everton.cookmyfood.Models.Cardapio;
import com.everton.cookmyfood.Models.ItemCardapio;
import com.everton.cookmyfood.Models.Mesa;
import com.everton.cookmyfood.Models.Pedido;
import com.everton.cookmyfood.Models.PedidoTradicional;
import com.everton.cookmyfood.Models.StatusPedido;

@Resource
public class PedidoTradicionalController {

	private final Result result;

	public PedidoTradicionalController(Result result) {
		this.result = result;
	}

	@Path("/pedidos/tradicional")
	public List<PedidoTradicional> index() {
		PedidoTradicionalAplicacao app = new PedidoTradicionalAplicacao();
		return app.listar(new PedidoTradicional());
	}

	public void formulario() {
		PedidoTradicional d = new PedidoTradicional();

		d.setStatus(StatusPedido.EmConsumo);

		PedidoTradicionalAplicacao app = new PedidoTradicionalAplicacao();
		app.salvar(d);

		result.redirectTo(this).alterar(d.getId());
	}

	@Path("/pedidos/tradicional/{id}")
	public PedidoTradicional alterar(Long id) {

		List<Cardapio> cardapios = new CardapioAplicacao()
				.listar(new Cardapio());

		result.include("cardapios", cardapios);
		
		List<Mesa> mesas = new MesaAplicacao().listar(new Mesa());
		
		result.include("mesas", mesas);

		PedidoTradicionalAplicacao app = new PedidoTradicionalAplicacao();
		return app.consultarPorID(id);
	}

	@Post
	public void cadastrarItem(Long id, ItemCardapio item, Cardapio cardapio, Mesa mesa) {

		PedidoTradicionalAplicacao app = new PedidoTradicionalAplicacao();

		PedidoTradicional delivery = app.consultarPorID(id);

		ItemCardapioAplicacao aplicacao = new ItemCardapioAplicacao();

		aplicacao.salvar(item);

		item.setPedido(delivery);

		cardapio = new CardapioAplicacao().consultarPorID(cardapio.GetId());
		
		mesa = new MesaAplicacao().consultarPorID(mesa.GetId());

		item.setCardapio(cardapio);
		
		delivery.setMesa(mesa);

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

	public void pesquisar(Long id) {
		PedidoAplicacao app = new PedidoAplicacao();

		Pedido item = app.consultarPorID(id);

		if (item != null) {
			result.redirectTo(this).alterar(id);
		} else {
			result.redirectTo(this).index();

		}
	}
}
