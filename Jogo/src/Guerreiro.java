
public class Guerreiro extends Jogador implements Movimentacao{

	public Guerreiro(int posX, int posY) {
		super(posX, posY);
	}


	@Override
	public void mover(int x, int y) {
		System.out.println("Está na posição: " + x + " e "+ y);
		
	}

}
