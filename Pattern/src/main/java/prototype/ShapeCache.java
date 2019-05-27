package prototype;

import java.util.Hashtable;

public class ShapeCache {

	private Hashtable<String, Shape> shapeCache  = new Hashtable<>();
	
	public Shape getshape(String shapeId) {
		Shape shape = shapeCache.get(shapeId);
		return (Shape) shape.clone();
	}
	
	public void loadShape() {
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeCache.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeCache.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("3");
		shapeCache.put(square.getId(), square);
	}
}
