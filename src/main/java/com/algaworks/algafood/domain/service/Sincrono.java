package com.algaworks.algafood.domain.service;

public class Sincrono {
	
	public static void main(String[] args) throws InterruptedException {
	  funcao1();
	  funcao2();	
	}
	public static void funcao1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("funcao 1");
	}
	public static void funcao2() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("funcao 2");
	}	

}
