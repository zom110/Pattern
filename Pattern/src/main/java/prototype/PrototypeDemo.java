package prototype;

public class PrototypeDemo {
	
	public static void main(String[] args) {
		
		ShapeCache shapeCache = new ShapeCache();
		shapeCache.loadShape();
		
		shapeCache.getshape("1").draw();
		shapeCache.getshape("2").draw();
		shapeCache.getshape("3").draw();
		
	}
}
