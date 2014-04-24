package com.everton.cookmyfood.Testes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.everton.cookmyfood.Aplicacao.CardapioAplicacao;
import com.everton.cookmyfood.Models.Cardapio;

public class TesteClass2 {

	public static void main(String[] args) {

		CardapioAplicacao app = new CardapioAplicacao();

		Map<String, Object> atts = new HashMap<String, Object>();

		atts.put("nome", "ca");
		atts.put("preco", 5.00);

		List<Cardapio> lista = app.listarPorLike(atts);

		
		for (Cardapio cardapio : lista) {
			System.out.println(cardapio.getNome());
		}
		
	}

}
