package abstractfactory;

import abstractfactory.impl.Blue;
import abstractfactory.impl.Green;
import abstractfactory.impl.Red;


public class ColorFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shape) {
		
		return null;
	}

	@Override
	Color getColor(String color) {

		if(color == null) {
			return null;
		}
		
		if("Red".equals(color)) {
			return new Red();
		}else if("Green".equals(color)) {
			return new Green();
		}else if("Blue".equals(color)) {
			return new Blue();
		}
		return null;
	}
}
