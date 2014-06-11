package test2poly;

public class TestEnter {

	public static void main(String[] args) {
		
		VissugUsers dbusers[] = new VissugUsers[2];
		dbusers[0] = new Jek_Buhgalter("Buhgalter1");
		dbusers[1] = new Jek_Pasportist("Pasportist1");
		
		for (VissugUsers p: dbusers){
				p.EnterProc();
		}
			
	}
}
