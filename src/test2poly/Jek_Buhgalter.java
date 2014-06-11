package test2poly;


public class Jek_Buhgalter extends VissugUsers implements EnterVissug {

	public Jek_Buhgalter(String name){
		super(name);
	}
	
	
	public boolean Enter(String name, String Pass) {
		System.out.println(name);
		System.out.println("Buhgalter functional is available");
			return true;
		
		}
	}
	
}
