package br.com.caelum.jdbc;

import java.util.Calendar;

import br.com.caelum.jdbc.modelo.Contatos;

public class TesteInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Contatos contato = new Contatos();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj87");
		contato.setDataNascimento(Calendar.getInstance());
		// grave nessa conexão!!!
		Misterio bd = new Misterio();
		// método elegante
		bd.adiciona(contato);
		System.out.println("Gravado!");
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}


