
public class Pig extends Animals {
	

	public Pig (String name, int size, boolean swims) {
		super(name, size, swims);
	}
	
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}
	public void size(){
		System.out.println(this.name + ": I'm full!");
	}


}
