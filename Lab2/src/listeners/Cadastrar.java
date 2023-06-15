package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.AlunoController;
import presentation.Cadastro;
import presentation.Tela;

public class Cadastrar implements ActionListener{
	private AlunoController controller;
	private Cadastro cadastro;
	
	public Cadastrar( AlunoController controller) {
		this.controller = controller;
		this.controller.setCadastroListener(this);
	}
	
	public Cadastro getCadastro() {
		return cadastro;
	}



	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}



	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//controller -> view
		this.controller.cadastrarAluno(this.getCadastro().getEstado());
	}

}
