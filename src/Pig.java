
public class Pig {
	
	String name;
	int size;
	boolean swims;
	int fullness;
	
	public Pig (String name, int size, boolean swims) {
		this.name = name;
		this.size = 6;
		this.swims = false;
		this.fullness = 10;
	}
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}
	public void size(){
		System.out.println(this.name + ": I'm full!");
	}


}
