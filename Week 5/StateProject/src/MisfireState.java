
public class MisfireState implements State{
	
	Cannon cannon;
	
	public MisfireState(Cannon cannon) {
		this.cannon = cannon;
	}


	public void insertShell() {
		System.out.println("Can't insert a shell, cannon already loaded");
		
	}


	public void ejectShell() {
		System.out.println("Shell ejected, cannon empty");
		cannon.setState(cannon.emptyState);
		
	}


	public void fire() {
		System.out.println("Can't fire, cannon misfired!");
		
	}


	public void unload() {
		System.out.println("Shell ejected, cannon empty");
		cannon.setState(cannon.emptyState);
		
	}
	
	

}
