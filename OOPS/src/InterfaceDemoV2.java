interface IPlayer {
	void walk();
	void run();
	void jump();
	void punch();
	void kick();
	void superKick();
	
	int JUMP_HEIGHT = 100;		// public static final int JUMP_HEIGHT = 100;
}

interface IExtraPower {
	void invisible();
}

abstract class CommonFeatures implements IPlayer {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	
}

class King extends CommonFeatures implements IPlayer, IExtraPower {

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void superKick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invisible() {
		// TODO Auto-generated method stub
		
	}
	
}

class Eddy extends CommonFeatures implements IPlayer {

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void superKick() {
		// TODO Auto-generated method stub
		
	}
	
}

class Paul extends CommonFeatures implements IPlayer {

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void superKick() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemoV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
