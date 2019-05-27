package abstractfactory.impl;

import abstractfactory.*;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square");
	}

}
