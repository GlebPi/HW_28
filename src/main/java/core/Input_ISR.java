package core;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Input_ISR {
public static void main( String[] args ) throws IOException {
	
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.print("Enter Your First Name: ");
	String first_name = br.readLine();
	System.out.print("Enter Your Last Name: ");
	String last_name = br.readLine();
	System.out.println("Your Full Name Is: " + first_name + " " + last_name);
	br.close();
}
}
