
public class BolaDeFogo implements Movimentacao {
	private int poder;
	private int posX;
	private int posY;

	@Override
	public void mover(int x, int y) {
		System.out.println("Está na posição: " + x + " e "+ y);
		
	}
	
	public BolaDeFogo(int poder) {
		this.poder = poder;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
