package robo;
import presentation.*;

public class Jogo {
	private Prompt prompt;
	private Rodada quadranteTela;
	private String nome;
	private Plano plano;
	private int quantidadeBugs;
	private int quantidadeAlunos;
	private int rodada;
	
	public Jogo() {
		this.prompt = new Prompt();
		this.plano = new Plano(7, 7);
		this.quadranteTela = new Rodada(this.plano, this);
		this.nome = prompt.promptNome();
		setTamanhoPlano(prompt.promptPlanoParametros());
		setQuantidadeBugs(prompt.promptQuantidadeBugs(maximoNumeroNPC()/2));
		setQuantidadeAlunos(prompt.promptQuantidadeAlunos(maximoNumeroNPC()-quantidadeBugs));
		prompt.fecharEntrada();
		this.rodada = 0;
	}
	
	public void jogar() {
		quadranteTela.imprimi();
	}
	
	
	
	public int getRodada() {
		return rodada;
	}

	public void setTamanhoPlano(String[] dimensoes) {
		try {
			int x = Integer.parseInt(dimensoes[0]);
			int y = Integer.parseInt(dimensoes[1]);
			if(x < 7 || y < 7) {
				x = 7;
				y = 7;
			}
			plano.setPlanoDimensoes(x, y);
		} catch (Exception e) {
			prompt.setMessage("Entrada Invalida. Usanda as dimensões padrão (7x7).");
			prompt.imprimi();
		}
	} 
	
	private int maximoNumeroNPC() {
		return plano.tamanhoPlano()/4;
	}

	public void setQuantidadeBugs(int quantidadeBugs) {
		if(quantidadeBugs > maximoNumeroNPC()/2) {
			this.quantidadeBugs = maximoNumeroNPC()/2;
			prompt.setMessage("A quantidade de bugs não pode ser maior do que a metade ("+maximoNumeroNPC()/2+") permitidade pelo jogo. Lembre-se que você também precisa de alunos no plano.");
			prompt.imprimi();
			return;
		}
		this.quantidadeBugs = quantidadeBugs;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		if(quantidadeAlunos > maximoNumeroNPC()-quantidadeBugs) {
			this.quantidadeAlunos = maximoNumeroNPC()-quantidadeBugs;
			prompt.setMessage("A quantidade de alunos será de "+this.quantidadeAlunos);
			prompt.imprimi();
			return;
		}else {
			this.quantidadeAlunos = quantidadeAlunos;
		}
	}
	
	
}
