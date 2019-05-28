package bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCiecle(int radius, int x, int y) {
		
		System.out.println("Draw Red circle [color : red, radius :"+ radius +", x : " + x +" , y : "+y +" ]" );

	}

}
