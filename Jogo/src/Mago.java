
public class Mago extends Jogador{
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
	
}
