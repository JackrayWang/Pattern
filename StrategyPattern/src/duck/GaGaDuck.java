package duck;

import duckbehavior.implfly.CannotFly;
import duckbehavior.implquack.GaGaQuack;
import superclass.Duck;

public class GaGaDuck extends Duck {
	
	public GaGaDuck() {
		iq = new GaGaQuack();
		ifi = new CannotFly();
	}
	
}
