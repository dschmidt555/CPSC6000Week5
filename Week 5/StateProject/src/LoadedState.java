
public class LoadedState implements State {
	Cannon cannon;
	

	public LoadedState(Cannon cannon) {
		this.cannon = cannon;
	}


	public void insertShell() {
		System.out.println("Can't do, already loaded.");
		
	}


	public void ejectShell() {
		System.out.println("Ejecting shell, cannon now empty.");
		cannon.setState(cannon.getEmptyState());
		
		
	}


	public void fire() {
		System.out.println("BOOOM!!!!!  Cannon Fired");
		cannon.setState(cannon.getFiredState());
		
	}


	public void unload() {
		System.out.println("Shell unloaded, cannon empty");
		cannon.setState(cannon.getEmptyState());
		
	}
	
	public String toString() {
		return "Waiting to fire!";
	}
	

}
