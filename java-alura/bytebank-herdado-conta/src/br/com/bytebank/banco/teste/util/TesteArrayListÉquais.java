package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListÉquais {

	public static void main(String[] args) {
	
		
		
		//Generic
		ArrayList <Conta> lista = new ArrayList();
		
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe =  lista.contains(cc2);
		
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			if(conta == cc3) {
				System.out.println("já tenho esssa conta!");
			} 
		}
		
			for(Conta conta : lista) {
				System.out.println(conta);
			}

	}

	
}
















