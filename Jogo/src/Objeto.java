
public class Objeto {
	private int posX;
	private int posY;
	
	public Objeto(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public void mover(int x, int y) {
		System.out.println("Está na posição: " + x + " e "+ x);
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
