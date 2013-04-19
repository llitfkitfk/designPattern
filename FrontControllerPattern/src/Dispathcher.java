
public class Dispathcher {
	private StudentView studentView;
	private HomeView homeView;
	
	public Dispathcher() {
		studentView =new StudentView();
		homeView = new HomeView();
	}
	
	public void dispatch(String request) {
		if(request.equalsIgnoreCase("Student")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}
