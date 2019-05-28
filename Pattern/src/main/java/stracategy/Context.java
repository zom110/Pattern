package stracategy;

public class Context {

	private Strategy strategy;
	
	Context(Strategy strategy ){
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int excuteStrategy(int num1,int num2) {
		return strategy.operate(num1, num2);
	}
}
