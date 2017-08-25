package core;
import java.io.Console;
public class Input_Console {
	public static void main(String[] args) {
		
		Console c = System.console();
		
		if (c == null) {System.err.println("Console Is Not Available"); System.exit(0);}
		String first_name = c.readLine("Enter Your First Name: ");
		String last_name = c.readLine("Enter Your Last Name: ");
		System.out.println("Your Full Name is: " + first_name + " " + last_name);
	}

}
