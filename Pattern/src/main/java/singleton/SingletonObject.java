package singleton;
/**
 * 单例
 * @author Administrator
 *
 */
public class SingletonObject {

	private static SingletonObject sinleton = new SingletonObject();
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		
		if(sinleton == null) {
			new SingletonObject();
		}
		
		return sinleton;
	}
	
	public void getMessage() {
		System.out.println(sinleton);
	}
	
}
