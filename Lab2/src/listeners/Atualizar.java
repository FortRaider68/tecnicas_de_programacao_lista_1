package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.Aluno;
import controller.AlunoController;

public class Atualizar implements ActionListener{
	
	private AlunoController controller;
	private presentation.Atualizar atualizar;
	
	public Atualizar(AlunoController controller) {
		this.controller = controller;
		this.controller.setAtualizaListener(this);
	}

	public presentation.Atualizar getAtualizar() {
		return atualizar;
	}

	public void setAtualizar(presentation.Atualizar atualizar) {
		this.atualizar = atualizar;
	}

	public void actionPerformed(ActionEvent e) {
		Aluno aluno = this.getAtualizar().getEstado();
		this.controller.atualizarAluno(aluno.getMatricula(),aluno.getVertente());
	}
	
	
}
