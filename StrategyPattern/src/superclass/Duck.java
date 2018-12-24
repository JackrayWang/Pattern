package superclass;

import duckbehavior.interfaces.IFlyDuckInterface;
import duckbehavior.interfaces.IQuackDuckInterface;

public abstract class Duck {
	
	public IQuackDuckInterface iq;
	public IFlyDuckInterface ifi;
	
	public Duck() {
		
	}

	public void getQuack() {
		iq.quack();
	}
	
	public void getIf() {
		ifi.fly();
	}
}
