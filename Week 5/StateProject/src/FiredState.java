
public class FiredState implements State{
	
	Cannon cannon;
	
	public FiredState(Cannon cannon) {
		this.cannon = cannon;
	}


	public void insertShell() {
		System.out.println("Cannot insert shell, cannon has shell already.");
		
	}


	public void ejectShell() {
		System.out.println("Shell ejected, cannon empty.");
		cannon.setState(cannon.emptyState);
		
	}

	
	public void fire() {
		System.out.println("Can't fire, shell has already been fired.");
		
	}


	public void unload() {
		System.out.println("Shell unloaded, cannon empty.");
		cannon.setState(cannon.emptyState);
		
	}
	
	public String toString() {
		return "Shell fired, need a new one";
	}

}
