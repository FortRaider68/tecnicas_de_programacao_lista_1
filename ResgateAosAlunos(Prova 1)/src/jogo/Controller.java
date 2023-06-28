package jogo;

import jogadores.Robo;
import listeners.*;
import persistence.RelatorioArquivo;
import presentation.GUI.Aviso;
import presentation.GUI.Tela;

public class Controller extends Jogo{
	private Tela tela;
	private IniciarJogo iniciarListener;
	private listeners.Celula celulaListener;
	private SelecionarRobo selecionarRoboListener; 
	private VerificarListener verificarListener;
	private ProximaRodada proximaRodadaListener;
	private Sair sairListener;
	private ListarRelatorios listarRelatoriosListener;
	private RelatorioArquivo persistenciaRelatorio;
	private boolean verificado;
	
	private Robo roboSelecionado;
	
	public Controller(Tela tela) {
		super(tela);
		this.tela = tela;
		this.tela.setController(this);
		this.listarRelatoriosListener = new ListarRelatorios(this);
		this.celulaListener = new listeners.Celula(this);
		this.selecionarRoboListener = new SelecionarRobo(this);
		this.iniciarListener = new IniciarJogo(this, this.tela);
		this.verificarListener = new VerificarListener(this);
		this.proximaRodadaListener = new ProximaRodada(this);
		this.sairListener = new Sair(tela);
		this.persistenciaRelatorio = new RelatorioArquivo();
		
		this.tela.getBotaolistarRelatorios().addActionListener(this.listarRelatoriosListener);
	}
	
	public void jogar() {
		this.tela.comecarJogo();
	}
	
	public void setNome() {
		String nome = tela.getPainelSuperior().getNomeDoJogadorField();
		if(!nome.isBlank())
			super.setNome(nome);
		else
			super.setNome("Sem nome");
	}

	public ListarRelatorios getListarRelatoriosListener() {
		return listarRelatoriosListener;
	}

	public listeners.Celula getCelulaListener() {
		return celulaListener;
	}

	public SelecionarRobo getSelecionarRoboListener() {
		return selecionarRoboListener;
	}

	public VerificarListener getVerificarListener() {
		return verificarListener;
	}

	public ProximaRodada getProximaRodadaListener() {
		return proximaRodadaListener;
	}

	public Sair getSairListener() {
		return sairListener;
	}
	
	public void setRoboSelecionado(Robo roboSelecionado) {
		this.roboSelecionado = roboSelecionado;
		this.tela.travarTabuleiro(false);
		if(this.roboSelecionado.getPosFinal() != null) {
			this.tela.celulaMarcada(this.roboSelecionado.getPosFinal());
		}else {
			this.tela.celulaMarcada(null);
		}
		this.tela.atualizarTabuleiro();
	}
	
	public void posicionarRobo(listeners.Celula celulaListener) {
		Coordenadas cor = celulaListener.getCelula().getCoordenadas();
		int nPassos = this.roboSelecionado.magnitude(celulaListener.getCelula().getCoordenadas());
		if(nPassos != 0 && nPassos <= this.roboSelecionado.getNumeroDePassos()) {
			this.tela.celulaMarcada(celulaListener);
			this.roboSelecionado.setPosFinal(celulaListener);
			this.tela.atualizarTabuleiro();
		}
	}
	
	public void verificar() {
		for (Robo robo: this.getRobos()) {
			if(robo.getPosFinal() == null) {
				new Aviso("Você precisa posicionar todos os robôs!");
				return;
			}
			robo.encontrouNPC(robo.getPosFinal().getCelula());
			robo.passouPelaCelula(robo.getPosFinal().getCelula());
		}
		this.verificado = true;
		this.tela.atualizarPontos();
	}
	
	public void proximarodada() {
		if(!this.verificado) {
			new Aviso("Você deve jogar a rodada primeiro");
			return;
		}
		for(Robo robo : this.getRobos()) {
			robo.setPosFinal(null);
		}
		this.verificado = false;
		this.tela.atualizarTabuleiro();
		this.setRodadaN(this.getRodadaN()+1);
	}
	
	public Relatorio gerarRelatorio() {
		int celulasVazias = 0;
		int pontuacao = 0;
		int nAlunos = 0;
		int nBugs = 0;
		
		for(Celula celula : this.getPlano().getCelulasMarcadas()) {
			if(celula.getPersonagem().isEmpty()) {
				celulasVazias++;
			}
		}
		
		for(Robo robo : this.getRobos()) {
			pontuacao+=robo.getPontos();
			nBugs+=robo.getnBugs();
			nAlunos+=robo.getnAlunos();
		}
		Relatorio relatorio = new Relatorio(this.getNome(),
				this.getRodadaN(),
				celulasVazias, 
				pontuacao, 
				nAlunos, 
				nBugs, 
				this.getRobos().get(0).getPontos(),
				this.getRobos().get(1).getPontos(),
				this.getRobos().get(2).getPontos());
		persistenciaRelatorio.gravarRelatorio(relatorio);
		
		return relatorio;
		
	}
	public void listarRelatorios(){
		this.tela.mostrarTelaListarRelatorios(persistenciaRelatorio.lerRelatorios());
	}
}
