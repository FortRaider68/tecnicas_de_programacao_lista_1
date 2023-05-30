package presentation;

import java.util.Scanner;

public abstract class Tela {
	
	private Scanner entrada;
	public static boolean cli;
	public static String message;
	
	public static String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		message = message;
	}
	
	public Tela() {
		super();
		entrada = new Scanner(System.in);
	}
	public void limparTela() {
		if(cli) {
			System.out.print("\033[H\033[2J");
		    System.out.flush();
		}else {
			System.out.println("--------------------------------------------------------------------------");
		}
	}
	
	//public abstract void imprimir();
	
	
	protected String lerEntrada() {
		String entradaLinha = entrada.nextLine();
		return entradaLinha;
	}
	
	public void fecharEntrada() {
		entrada.close();
	}
	
	public String promptString() {
		return lerEntrada();
	}
	
	public int promptInt() {
		return Integer.parseInt(lerEntrada());
	}
	
	public String[] promptToken(String token) {
		String [] parametros;
		try {
			parametros = lerEntrada().split(token);
		} catch (Exception e) {
			parametros = null;
		}
		return parametros;
	}
	
}
