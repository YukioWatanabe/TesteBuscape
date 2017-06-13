package com.teste.buscape.exceptions;

/**
 * Exception caso o tenha um input de um comando que n�o foi definido no exemplo
 */
public class ComandoInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;
	public ComandoInvalidoException(){
		super("Comando inv�lido foi digitado.");
	}
}
