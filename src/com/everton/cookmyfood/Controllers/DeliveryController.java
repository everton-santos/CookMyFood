package com.everton.cookmyfood.Controllers;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

import com.everton.cookmyfood.Aplicacao.DeliveryAplicacao;
import com.everton.cookmyfood.Models.Delivery;

@Resource
public class DeliveryController {

	@Path("/pedidos")
	public List<Delivery> index() {
		DeliveryAplicacao app = new DeliveryAplicacao();
		return app.listar(new Delivery());
	}
}
