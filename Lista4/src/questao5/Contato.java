package questao5;

import java.util.*;

public class Contato{
	public int codigo;
	public String nome;
	public String endereco;
	private String email;
	public String telefone;
	public String observacao;
	
	//CONSTRUCTOR//
	
	public Contato(int codigo) {
		super();
		if(validarCodigo(codigo))
			this.codigo = codigo;
			
	}

	public Contato(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Contato(int codigo, String nome, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
	}

	public Contato(String telefone) {
		super();
		if(!validarTelefone(telefone))
			return;
		this.telefone = telefone;
	}
	
	//CONSTRUCTOR - END//

	
	public String getEmail() {
		return this.email;
	}
	
	public void imprimiContato() {
		System.out.printf("#==========================================================#\n"
						+ "CÓDIGO:%d\nNOME:%s\nENDEREÇO:%s\nEMAIL:%s\nTELEFONE:%s\nOBSERVAÇÃO:%s\n"
						+ "#==========================================================#\n", 
						this.codigo,
						this.nome,
						this.endereco,
						this.email,
						this.telefone,
						this.observacao
		);
	}
	
	public boolean validarCodigo(int codigo) {
		if(codigo >= 1000 && codigo <= 9999)
			return true;
		System.err.println("O Código inserido é invalido. Para ser valido ele deve estar entre [1000,9999].");
		return false;
	}
	
	public boolean validarTelefone(String telefone) {
		telefone.trim();
		
		for (int i = 0; i < telefone.length(); i++) {
			if(!Character.isDigit(telefone.charAt(i))) {
				System.err.println("O telefone deve conter apenas digitos.");
				return false;
			}
		}
		
		if(telefone.length() != 8) {
			System.err.println("O telefone precisa ter 8 digitos.");
			return false;
		}
		
		return true;
	}
	
	public Contato copiarContato() {
		return this;
	}
	
	public boolean contatoVazio() {
		if(
				this.codigo == 0 ||
				this.nome == null ||
				this.endereco == null ||
				this.email == null ||
				this.telefone == null ||
				this.observacao == null 
		) {
			System.err.println("Todos os campos do contato devem ser preenchidos.");
			return false;
		}
		return true;
	}
	
}
