package bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		new Circle(new RedCircle(), 1, 1, 1).draw();
		new Circle(new GreenCircle(), 2, 2, 2).draw();
	}
}
