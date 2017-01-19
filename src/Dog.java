
public class Dog extends Animals {
	
	String name;
	int size;
	boolean swims;
	
	public Dog(String name, int size, boolean swims) {
		this.name = name;
		this.size = 5;
		this.swims = true;
	}
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}
}
