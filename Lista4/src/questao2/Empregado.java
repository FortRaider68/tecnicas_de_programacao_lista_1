package questao2;

public class Empregado {
	public String nome;
	public String sobrenome;
	public float salario;
	
	public Empregado(String nome, String sobrenome, float salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		
		if(salario < 0.0)
			this.salario = 0.0f;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
		if(salario < 0)
			this.salario = 0;
	}
	
	public void exibeSalarioAnual() {
		System.out.println("Seu salário anual será de: "+salario*12 + " Reais.");
	}
	
}
