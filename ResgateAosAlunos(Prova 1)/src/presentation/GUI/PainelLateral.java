package presentation.GUI;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jogadores.Robo;
import jogo.Controller;
import listeners.SelecionarRobo;

public class PainelLateral extends JPanel{
	
	private int pontuacao;
	private int nBugs;
	private int nAlunos;
	protected JLabel pontosAndador;
	protected JLabel pontosRainha;
	protected JLabel pontosCavalo;
	private JButton botaoRobo;
	private JButton botaoRainha;
	private JButton botaoCavalo;
	protected JButton botaoVerificar;
	protected JButton botaoProximaRodada;
	protected JButton botaoSair;
	private ImageIcon iconCavalo;
	
	public PainelLateral(SelecionarRobo selecionarRoboListener, ArrayList<Robo> listaRobos) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(6, 0, 6, 0);

		this.pontuacao = 0;
		this.nBugs = 0;
		this.nAlunos = 0;
		this.pontosAndador = new JLabel("0");
		this.pontosCavalo = new JLabel("0");
		this.pontosRainha = new JLabel("0");
		
		this.botaoRobo = new JButton(new ImageIcon("resources/bender_30x30.jpg"));
		this.botaoRainha = new JButton(new ImageIcon("resources/rainha_30x30.jpg"));
		this.botaoCavalo = new JButton(new ImageIcon("resources/cavalo_30x30.jpg"));
		
		try {
			SelecionarRobo andadorListener = selecionarRoboListener.clone();
			andadorListener.setRobo(listaRobos.get(0));
			this.botaoRobo.addActionListener(andadorListener);
			SelecionarRobo cavaloListener = selecionarRoboListener.clone();
			cavaloListener.setRobo(listaRobos.get(1));
			this.botaoCavalo.addActionListener(cavaloListener);
			SelecionarRobo rainhaListener = selecionarRoboListener.clone();
			rainhaListener.setRobo(listaRobos.get(2));
			this.botaoRainha.addActionListener(rainhaListener);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		this.botaoVerificar = new JButton("Verificar");
		this.botaoProximaRodada = new JButton("Próxima rodada");
		this.botaoSair = new JButton("Sair");
		
		c.gridwidth = 2;
		
		this.add(new JLabel("Pontuação: "+this.pontuacao),c);
		
		c.gridy = 1;
		// quantidade alunos - bugs
		JPanel quantidade  = new JPanel();
		quantidade.setLayout(new FlowLayout());
		quantidade.add(new JLabel(new ImageIcon("resources/aluno_30x30.png")));
		quantidade.add(new JLabel(""+this.nAlunos));
		quantidade.add(new JLabel(new ImageIcon("resources/bug_30x30.png")));
		quantidade.add(new JLabel(""+this.nBugs));
		this.add(quantidade,c);
		
		c.gridy = 2;
		//pontuação robôs
		JPanel pontuacao = new JPanel();
		pontuacao.setLayout(new FlowLayout());
		
		pontuacao.add(new JLabel(new ImageIcon("resources/bender_30x30.jpg")));
		
		pontuacao.add(this.pontosAndador);
		pontuacao.add(new JLabel(new ImageIcon("resources/rainha_30x30.jpg")));
		pontuacao.add(this.pontosRainha);
		pontuacao.add(new JLabel(new ImageIcon("resources/cavalo_30x30.jpg")));
		pontuacao.add(this.pontosCavalo);
		this.add(pontuacao,c);
		
		c.gridy = 3;
		//seleção robôs
		JPanel robos = new JPanel();
		robos.setLayout(new FlowLayout());
		robos.add(this.botaoRobo);
		robos.add(this.botaoRainha);
		robos.add(this.botaoCavalo);
		this.add(robos,c);
		
		c.insets = new Insets(2, 0, 2, 0);
		c.ipady = 25;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 4;
		this.add(this.botaoVerificar,c);
		c.gridy = 5;
		this.add(this.botaoProximaRodada,c);
		c.gridy = 6;
		this.add(this.botaoSair,c);
		
	}

	
	
	
}
