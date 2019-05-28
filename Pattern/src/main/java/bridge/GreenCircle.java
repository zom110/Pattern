package bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCiecle(int radius, int x, int y) {
		
		System.out.println("Draw Green circle [color : Green, radius :"+ radius +", x : " + x +" , y : "+y +" ]" );

	}

}
