
public abstract class Jogador extends Objeto{
	private String nome;
	
	public Jogador(String nome, int posX, int posY) {
		super(posX, posY);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
