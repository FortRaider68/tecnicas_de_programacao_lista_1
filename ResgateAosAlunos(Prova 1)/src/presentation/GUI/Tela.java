package presentation.GUI;

import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jogadores.Robo;
import jogo.Controller;
import jogo.Plano;
import listeners.Celula;

public class Tela extends JFrame{
	
	private PainelLateral painelLateral;
	private PainelSuperior painelSuperior;
	private Quadrante tabuleiro;
	private Controller controller;
	private JPanel conteudoCentral;
	private JPanel painelJogo;
	private JPanel painelRelatorio;
	private Relatorio telaRelatorio;
	private CardLayout estadoPainel;
	private GridBagConstraints c;
 
	public Tela() {
		super("Resgate aos Alunos (GUI)");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		
		this.conteudoCentral = new JPanel();
		this.estadoPainel = new CardLayout();
		this.conteudoCentral.setLayout(this.estadoPainel);
		
		this.c = new GridBagConstraints();
		
		c.gridy = 0;
		c.gridwidth = 2;
		this.painelSuperior = new PainelSuperior();
		this.add(this.painelSuperior, c);
		c.gridy = 1;
		this.add(this.conteudoCentral,c);
		
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}

	public JButton getBotaolistarRelatorios() {
		return this.painelSuperior.relatorioBotao;
	}
	
	public JButton getBotaoVerificar() {
		return painelLateral.botaoVerificar;
	}

	public JButton getBotaoProximaRodada() {
		return painelLateral.botaoProximaRodada;
	}

	
	public void comecarJogo() {
		this.painelJogo = new JPanel();
		this.painelJogo.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridy = 0;
		c.gridx = 0;
		c.gridwidth = 1;
		this.tabuleiro = new Quadrante(this.controller.getCelulaListener(),this.controller.getPlano());
		this.tabuleiro.setVisible(true);
		this.tabuleiro.revalidate();
		this.tabuleiro.repaint();
		this.painelJogo.add(this.tabuleiro,c);
		
		c.gridy = 0;
		c.gridx =1;
		c.anchor = GridBagConstraints.PAGE_END;
		this.painelLateral = new PainelLateral(controller.getSelecionarRoboListener(),controller.getRobos());
		this.painelLateral.botaoVerificar.addActionListener(this.controller.getVerificarListener());
		this.painelLateral.botaoProximaRodada.addActionListener(this.controller.getProximaRodadaListener());
		this.painelLateral.botaoSair.addActionListener(this.controller.getSairListener());
		this.painelLateral.setVisible(true);
		this.painelJogo.add(this.painelLateral,c);
		
		this.conteudoCentral.add(this.painelJogo);
		this.estadoPainel.next(this.conteudoCentral);
		
		this.revalidate();
		this.repaint();
		this.pack();
	}

	public PainelSuperior getPainelSuperior() {
		return painelSuperior;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	} 
	
	public void travarTabuleiro(boolean estado) {
		if(this.tabuleiro != null) {
			this.tabuleiro.travarBotoes(estado);
			this.tabuleiro.revalidate();
			this.tabuleiro.repaint();
			this.repaint();
		}
	}
	
	public void celulaMarcada(Celula celulaLogica) {
		for (Celula celula : this.tabuleiro.celulasListener) {
			if(celula == celulaLogica) {
				celula.getBotao().marcar(true);
			}else {
				celula.getBotao().marcar(false);
			}
		}
	}
	
	public void atualizarTabuleiro() {
		for(Celula celula : this.tabuleiro.celulasListener) {
			if(celula.getCelula().isMarcada())
				celula.getBotao().marcar(true);
		}
	}
	
	public void atualizarPontos() {
		for(Robo robo : this.controller.getRobos()) {
			if(robo.getNome() == "Andador")
				this.painelLateral.pontosAndador.setText(robo.getPontos()+"");
			if(robo.getNome() == "Cavalo")
				this.painelLateral.pontosCavalo.setText(robo.getPontos()+"");
			if(robo.getNome() == "Rainha")
				this.painelLateral.pontosRainha.setText(robo.getPontos()+"");
		}
		this.painelLateral.revalidate();
		this.painelLateral.repaint();
		this.revalidate();
		this.repaint();
	}
	
	public void mostrarTelaRelatorio() {
		jogo.Relatorio relatorio = this.controller.gerarRelatorio();
		this.telaRelatorio = new Relatorio(relatorio.getRelatorio());
		this.conteudoCentral.add(telaRelatorio);
		this.estadoPainel.next(this.conteudoCentral);
		this.revalidate();
		this.repaint();
		this.pack();
	}
	
	public void mostrarTelaListarRelatorios(Object[][] relatorios) {
		this.conteudoCentral.add( new Relatorio(relatorios));
		this.estadoPainel.next(this.conteudoCentral);
		this.revalidate();
		this.repaint();
		this.pack();
	}
}
