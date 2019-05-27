package abstractfactory;

import abstractfactory.impl.Circle;
import abstractfactory.impl.Rectangle;
import abstractfactory.impl.Square;

public class ShapeFactory extends AbstractFactory {
	
	@Override
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

	@Override
	Color getColor(String color) {

		return null;
	}
}
