
public class Guerreiro extends Jogador implements Movimentavel{

	public Guerreiro(int posX, int posY) {
		super(posX, posY);
	}


	@Override
	public void mover(int x, int y) {
		System.out.println("Está na posição: " + x + " e "+ y);
		
	}

}
