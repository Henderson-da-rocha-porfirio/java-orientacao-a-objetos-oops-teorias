
public class Aplicacao {

	public static void main(String[] args) {

		// Criando objetos no java:
		Pessoa p1 = new Pessoa(); // Pessoa ( tipo ),  p1 ( variável ). O " new " que faz a criação da objeto no heap ( área de armazenamento de variáveis e objetos na memória ).
									// p1 pode acessar os atributos e métodos dessa Pessoa.
		p1.nome = "José"; //
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		
		p1.receber(5); // Método receber implementou a quantidade inicial 0 para 5.
		p1.receber(7); // José recebe mais 7 que fica = 12 figurinhas.
		
		p1.dar(2, p2); // Ele dá duas figurinhas para maria = Ficando com 10 figurinhas.
		
		p2.dar(1, p1);// Maria recebeu duas figurinhas de josé e dá mais 1 figurinha para josé que ficará com 11 e Maria com 1 figurinha.

		// Atalho é digitar sout para System.out.println:
		System.out.println(p1.nome + " => " + p1.numFigurinhas);
		System.out.println(p2.nome + " => " + p2.numFigurinhas);
	}
}
