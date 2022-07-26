package Class;

public class Node {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void sexX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void sexY(int y) {
		this.y = y;
	}
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}
