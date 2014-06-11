package test2poly;

//import java.util.Scanner;

public class Jek_Buhgalter extends VissugUsers implements EnterVissug {

	public Jek_Buhgalter(String name){
		super(name);
	}
	
	//private String Pass = "87654321";
	//Scanner scan = new Scanner(System.in);
	
	public boolean Enter(String name, String Pass) {
		System.out.println(name);
		//System.out.println("Input Password:");
		//String s = scan.nextLine();
		
		//if (s.equals(this.Pass)) {
			//System.out.println("Success!");
			System.out.println("Buhgalter functional is available");
			return true;
		//}	
		/*else {
			System.out.println("Error! Incorrect password");
			return false;
		}	*/
	}
	
}
