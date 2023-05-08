import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Banco DB = new Banco();
		
		Livro javaBook = new Livro("Java Livros", 1997, "James G.", 6);
		Livro cBook = new Livro("C Livros", 1989, "K&R", 20);
		Livro livro1 = new Livro("The Pragmatic Programmer: From Journeyman to Master", 2001, "Andrew Hunt and David Thomas", 6);
		Livro livro2 = new Livro("Code Complete: A Practical Handbook of Software Construction", 2013, "Steve McConnell", 7);
		Livro livro3 = new Livro("Clean Code: A Handbook of Agile Software Craftsmanship", 2017, "Robert C. Martin", 8);
		Livro livro4 = new Livro("Design Patterns: Elements of Reusable Object-Oriented Software", 1997, "Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides", 4);
		Livro livro5 = new Livro("Introduction to Algorithms",1994,"Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein",9);
		Livro livro6 = new Livro("Programming Pearls",2004,"Jon Bentley",5);
		Livro livro7 = new Livro("The Mythical Man-Month: Essays on Software Engineering", 1971, "Frederick P. Brooks Jr", 6);
		Livro livro8 = new Livro("Structure and Interpretation of Computer Programs", 1985, "Harold Abelson and Gerald Jay Sussman", 6);
		Livro livro9 = new Livro("Head First Design Patterns: A Brain-Friendly Guide", 1993, "Eric Freeman, Elisabeth Robson, Bert Bates, and Kathy Sierra", 3);
		DB.cadastrarPublicacoes(javaBook);
		DB.cadastrarPublicacoes(cBook);
		DB.cadastrarPublicacoes(livro1);
		DB.cadastrarPublicacoes(livro2);
		DB.cadastrarPublicacoes(livro3);
		DB.cadastrarPublicacoes(livro4);
		DB.cadastrarPublicacoes(livro5);
		DB.cadastrarPublicacoes(livro6);
		DB.cadastrarPublicacoes(livro7);
		DB.cadastrarPublicacoes(livro8);
		DB.cadastrarPublicacoes(livro9);
		
		Professor profJonas = new Professor(5849403, "Jonas");
		DB.cadastrarCliente(profJonas);
		Aluno aluJoao = new Aluno(5646756, "João");
		DB.cadastrarCliente(aluJoao);
		
		Emprestismo emprestimo1 = new Emprestismo(cBook, 6, aluJoao);
		//emprestimo1.concluirEmprestimo(DB);
	
		Emprestismo emprestimo2 = new Emprestismo(livro1, 6, aluJoao);
		emprestimo2.concluirEmprestimo(DB);
		
		Emprestismo emprestimo3 = new Emprestismo(livro2, 6, aluJoao);
		emprestimo3.concluirEmprestimo(DB);
		
		Emprestismo emprestimo4 = new Emprestismo(livro3, 6, aluJoao);
		emprestimo4.concluirEmprestimo(DB);
		
		Emprestismo emprestimo5 = new Emprestismo(livro4, 6, aluJoao);
		emprestimo5.concluirEmprestimo(DB);
		
		Emprestismo emprestimo6 = new Emprestismo(livro5, 6, aluJoao);
		emprestimo6.concluirEmprestimo(DB);
		
		emprestimo5.devolverEmprestimo(DB);
		emprestimo6.concluirEmprestimo(DB);
		
		emprestimo4.devolverEmprestimo(DB);
		emprestimo5.concluirEmprestimo(DB);

		
		System.out.println(aluJoao.tps);
		System.out.println(cBook.quantidade);
		


	}

}
