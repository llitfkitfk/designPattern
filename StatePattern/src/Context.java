
public class Context {
	private State state;
	
	public Context() {
		// TODO Auto-generated constructor stub
		state = null;
	}
	
	public void setState(State state) {
		this.state =state;
	}
	
	public State getState() {
		return state;
	}
}
