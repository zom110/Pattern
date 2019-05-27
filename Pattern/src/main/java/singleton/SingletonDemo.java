package singleton;
/**
 * 工厂模式Demo
 * 
 * @author Administrator
 *
 */
public class SingletonDemo {

	public static void main(String[] args) {
		
	SingletonObject instance = SingletonObject.getInstance();
	instance.getMessage();
	instance = SingletonObject.getInstance();
	instance.getMessage();
	}
}
