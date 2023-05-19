package negocio;

import apresentacao.*;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;
	private int numero;

	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		numeroEscolhido = sortearSegredo();
		jogando = true;
	}

	public int sortearSegredo() {
		return (int)(Math.random() * 100);
	}
	
	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual é o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	private boolean validarNumero(String entrada) {
		try {
			this.numero = Integer.parseInt(entrada);
			return true;
		} catch (Exception e) {
			tela.mesagem("Parece que o que você digitou não é um numero. Tente outra vez.");
			return false;
		}
	}
	
	private String solicitarEntrada() {
		return tela.entradaDados("NÚMERO DE JOGADAS:"+ jogador.getNumeroTentativa()+"\n\nInforme um numero:");
	}
	
	public int solicitarNumero() {
		String entrada = "";
		do {
			entrada = solicitarEntrada();
		}while(!validarNumero(entrada));
		
		return this.numero;
	}

	public void jogadas() {
		do {
			verificarAcerto();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Numeros apostados: " + numeros);

	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;

		return false;
	}
	
	public void dicaAcerto(int numero) {
		if (verificarMenor(numero)) {
			tela.mesagem("tente um numero maior");
		} else {
			tela.mesagem("Tente numero menor");
		}
	}

	public void verificarAcerto() {
		int numero = solicitarNumero();
		jogador.addNumero(numero);
		if (numero == numeroEscolhido) {
			tela.mesagem("Parabens voce acertou! numero de tentativas: " + jogador.getNumeroTentativa());
			jogando = false;
		} else {
			tela.mesagem("Deu ruim,  voce errou");
			jogador.setNumeroTentativa();
			dicaAcerto(numero);
		}
	}

	// public void verificarAcerto() {
	// do {
	// if (solicitarNumero() == numeroEscolhido) {
	// jogador.setNumeroTentativa();
	// tela.mesagem("Parabens voce acertou! numero de tentativas: " +
	// jogador.getNumeroTentativa());
	// return;
	// } else {
	// tela.mesagem("Deu ruim, voce errou");
	// jogador.setNumeroTentativa();
	// }
	// } while (true);
	// }
}
