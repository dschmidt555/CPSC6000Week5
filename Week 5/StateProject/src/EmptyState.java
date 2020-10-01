
public class EmptyState implements State{
	
	Cannon cannon;
	
	public EmptyState(Cannon cannon) {
		this.cannon = cannon;
	}


	public void insertShell() {
		System.out.println("Shell inserted, Cannon loaded and ready to fire!");
		cannon.setState(cannon.loadedState);
		
	}

	
	public void ejectShell() {
		System.out.println("No shell to eject, cannon empty.");
		
	}


	public void fire() {
		System.out.println("Can not fire, cannon empty.");
		
	}

	
	public void unload() {
		System.out.println("Can not unload, cannon empty.");
		
	}
	
	public String toString() {
		return "Insert Shell.";
	}
	
	

}
