
public class Dog extends Animals {
	

	public Dog (String name, int size, boolean swims) {
		super (name, size, swims);
	}
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}
	public void noise(){
		System.out.println(this.name + ": Woof Woof!");
	}
}
