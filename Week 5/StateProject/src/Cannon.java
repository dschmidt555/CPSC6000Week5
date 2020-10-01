
public class Cannon {
	
	State emptyState;
	State loadedState;
	State firedState;
	State misfireState; 
	
	State state;
	
	public Cannon() {
		emptyState = new EmptyState(this);
		loadedState = new LoadedState(this);
		firedState = new FiredState(this);
		misfireState = new MisfireState(this);
		
		state = emptyState;
		
	}
	
	public void insertShell() {
		state.insertShell();
	}
	
	public void ejectShell() {
		state.ejectShell();
	}
	
	public void fire() {
		state.fire();
	}
	
	public void unload() {
		state.unload();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public State getEmptyState() {
		return emptyState;
	}
	
	public State getLoadedState() {
		return loadedState;
	}
	
	public State getFiredState() {
		return firedState;
	}
	
	public State getMisfireState() {
		return misfireState; 
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(state);
		return result.toString();
	}
	

}
