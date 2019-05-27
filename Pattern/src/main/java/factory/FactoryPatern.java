package factory;

import factory.impl.Circle;
import factory.impl.Rectangle;
import factory.impl.Square;

public class FactoryPatern {

	public Shape getShape(String shape) {
		
		if(shape == null) {
			return null;
		}
		
		if("Circle".equals(shape)) {
			return new Circle();
		}else if("Rectangle".equals(shape)) {
			return new Rectangle();
		}else if("Square".equals(shape)) {
			return new Square();
		}
		return null;
	}
}
