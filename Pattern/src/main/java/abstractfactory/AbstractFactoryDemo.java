package abstractfactory;
/**
 * 抽象工厂模式Demo
 * 
 * @author Administrator
 *
 */
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		AbstractFactory factory = FactoryProductor.getFactory("shape");
		factory.getShape("Circle").draw();
		factory.getShape("Rectangle").draw();
		factory.getShape("Square").draw();
		
		factory = FactoryProductor.getFactory("color");
		factory.getColor("Red").fill();
		factory.getColor("Green").fill();
		factory.getColor("Blue").fill();
	}
}
