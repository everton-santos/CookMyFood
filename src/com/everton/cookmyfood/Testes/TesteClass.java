package com.everton.cookmyfood.Testes;

import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Models.Cliente;
import com.everton.cookmyfood.Models.Endereco;

public class TesteClass {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setLoginName("Everton");
		cliente.setLoginPass("123456");
		cliente.setNome("Everton Pereira Santos");
		cliente.setCelular("1235");
		cliente.setEmail("everton.mailbox@gmail.com");
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Geisel");
		endereco.setCep(58000000);
		endereco.setLogradouro("Rua ex comb assis luiz");
		endereco.setNumero("234");
		endereco.setTelefone("123124124");
		endereco.setComplemento("casa 09");
		
		cliente.setEndereco(endereco);
		
		ClienteAplicacao app = new ClienteAplicacao();
		app.salvar(cliente);
		
	}
}
