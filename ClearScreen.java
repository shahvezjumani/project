package ClearScreen;
public class ClearScreen{

	public void cls() throws Exception{						// Clear Screen Method
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();   
	}
}