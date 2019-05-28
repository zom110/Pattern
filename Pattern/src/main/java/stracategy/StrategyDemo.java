package stracategy;

public class StrategyDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new AddStrategy());
		System.out.println("add : "+context.excuteStrategy(1, 2));
		
		context.setStrategy(new SubStrategy());
		System.out.println("sub : " + context.excuteStrategy(1, 2));
		
		context.setStrategy(new MultiStrategy());
		System.out.println("multi : "+context.excuteStrategy(1, 2));
	}
}
