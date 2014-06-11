package test2poly;

abstract public class VissugUsers  {
	
	private String name;
	private String Pass;
	
	public VissugUsers(String name){
		this.name=name;
	}
	
	public String getName(){
		return "User name is " + name; 
	}
	
	public void EnterProc() {
		 Enter(name, Pass);		
	}
	
	public abstract boolean Enter (String name, String Pass);
	
	public void RunTeamViewer () {
		//Run TeamViewer.exe
	}
	
		
	
}
