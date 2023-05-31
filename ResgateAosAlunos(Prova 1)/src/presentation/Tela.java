package presentation;

import java.util.Scanner;

public abstract class Tela {
	
	private Scanner entrada;
	private static boolean cli;
	private static String message;
	
	public Tela() {
		super();
		this.cli = false;
		entrada = new Scanner(System.in);
	}
	
	public static String getMessage() {
		return Tela.message;
	}
	public static void setMessage(String message) {
		Tela.message = message;
	}
	
	public static boolean getCli() {
		return Tela.cli;
	}
	
	public static void setCli(boolean cli) {
		 Tela.cli = cli;
	}
	
	public void limparTela() {
		if(cli) {
			System.out.print("\033[H\033[2J");
		    System.out.flush();
		}else {
			System.out.println("--------------------------------------------------------------------------");
		}
	}
	
	public abstract void imprimir();
	
	
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
