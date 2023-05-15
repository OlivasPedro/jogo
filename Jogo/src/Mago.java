
public class Mago extends Jogador implements Fase{
	private int mp;

	public Mago(int posX, int posY, int mp) {
		super(posX, posY);
		this.mp = mp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public void carregar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mover(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
