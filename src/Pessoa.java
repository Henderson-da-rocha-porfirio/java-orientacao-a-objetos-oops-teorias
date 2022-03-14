
public class Pessoa { // Classe Pessoa

	// Atributos da classe Pessoa: nome e numero de figurinhas(numFigurinhas):
	String nome; // String é uma classe do java que representa uma cadeia de caracteres. O valor padrão da String é null.
	int numFigurinhas; // int é um tipo primitivo de dados. O valor padrão do tipo primitivo int é 0.
	
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	} // Método receber
																				// Retorno Void = não retorna nada. ( quem chamou o método, quem chamou o método, não espera uma resposta ).
	void dar(int numFigurinhas, Pessoa p) { // Método dar. Retorno Void = não retorna nada ( quem chamou o método, não espera uma resposta ).
												// Passado no parâmetro numFigurinhas.
		this.numFigurinhas -= numFigurinhas; // Esse " this " é para evitar duplicidade: this.numFigurinhas
											// Ele refere-se ao atributo numFigurinhas e não a numFigurinhas que está sendo passado no parâmetro.
											// Já numFigurinhas sem o " this " é justamente o passado no parâmetro.
											// Clicando com o botão direito do mouse, ele mostra a referência de numFigurinhas também, se parâmetro ou atributo.
		//p.numFigurinhas += numFigurinhas;
		p.receber(numFigurinhas);
	}
}
