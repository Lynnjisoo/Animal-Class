
public class Rabbit {
	
	String name;
	int size;
	boolean swims;

	public Rabbit (String name, int size, boolean swims) {
		this.name = name; 
		this.size = 7;
		this.swims = true;
	}
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}

}
