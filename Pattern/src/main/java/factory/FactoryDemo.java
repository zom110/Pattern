package factory;
/**
 * 工厂模式Demo
 * 
 * @author Administrator
 *
 */
public class FactoryDemo {

	public static void main(String[] args) {
		
		FactoryPatern factoryPatern = new FactoryPatern();
		factoryPatern.getShape("Circle").draw();
		factoryPatern.getShape("Rectangle").draw();
		factoryPatern.getShape("Square").draw();
	}
}
