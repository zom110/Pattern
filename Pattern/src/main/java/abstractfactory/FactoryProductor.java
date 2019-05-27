package abstractfactory;

public  class FactoryProductor {

	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(factory.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
		
		return null;
	}
}
