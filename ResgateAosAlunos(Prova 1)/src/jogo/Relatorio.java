package jogo;

public class Relatorio {
	private String nome;
	private int numeroDeRodadas;
	private int celulasVazias;
	private int pontuacao;
	private int alunosResgatados;
	private int bugsEncotrados;
	private int pontosAndador;
	private int pontosCavalo;
	private int pontosRainha;
	
	public Relatorio(String nome, int numeroDeRodadas, int celulasVazias, int pontuacao, int alunosResgatados,
			int bugsEncotrados, int pontosAndador, int pontosCavalo, int pontosRainha) {
		super();
		this.nome = nome;
		this.numeroDeRodadas = numeroDeRodadas;
		this.celulasVazias = celulasVazias;
		this.pontuacao = pontuacao;
		this.alunosResgatados = alunosResgatados;
		this.bugsEncotrados = bugsEncotrados;
		this.pontosAndador = pontosAndador;
		this.pontosCavalo = pontosCavalo;
		this.pontosRainha = pontosRainha;
	}

	public Object [] getRelatorio() {
		Object [] objetoRelatorio = new Object[9];
		
		objetoRelatorio[0] = this.nome;
		objetoRelatorio[1] = this.numeroDeRodadas;
		objetoRelatorio[2] = this.celulasVazias;
		objetoRelatorio[3] = this.pontuacao;
		objetoRelatorio[4] = this.alunosResgatados;
		objetoRelatorio[5] = this.bugsEncotrados;
		objetoRelatorio[6] = this.pontosAndador;
		objetoRelatorio[7] = this.pontosCavalo;
		objetoRelatorio[8] = this.pontosRainha;
		
		return objetoRelatorio;
	}
	
}
