
public class BolaDeFogo extends Objeto {
	private int poder;
	
	public BolaDeFogo(int posX, int posY, int poder) {
		super(posX, posY);
		this.poder = poder;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

}
