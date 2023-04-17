package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;

public class Atividade {
	public static void main(String[] args) {
		Cliente clienteNormal = new Cliente();
		clienteNormal.setNome("Flavio");

		Cliente clienteVip = new Cliente();
		clienteVip.setNome("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;

		//System.out.println(refs[1].getNome());
	}
}
