package duckbehavior.implfly;

import duckbehavior.interfaces.IFlyDuckInterface;

public class CannotFly implements IFlyDuckInterface {

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}

}
