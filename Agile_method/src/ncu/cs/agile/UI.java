package ncu.cs.agile;

public class UI {
	public UI() {
		
	}
	// Check ID is true or not (falls into Exception)
	public boolean checkID(String ID) {
		return true; 
	}
	// Ask users to input their commands
	public String promptCommand() {
		return "true"; 
	}
	// Ask users to enter the ID
	public String promptID() {
		return "ID"; 
	}
	// Finish messages is output or not
	public boolean showFinishMsg() {
		return true;
	}
	// Welcome messages is output or not
	public boolean showWelcomeMsg(String ID) {
		return true;
	}
}
