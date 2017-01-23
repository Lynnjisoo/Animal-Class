
public class Dog extends Animals {
	
	String name;
	int size;
	boolean swims;
	int noise;
	
	public Dog(String name, int size, boolean swims) {
		this.name = name;
		this.size = 5;
		this.swims = true;
	}
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}
	public void noise(){
		System.out.println(this.name + ": Woof Woof!");
	}
}
