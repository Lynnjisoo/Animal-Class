
public class Dog extends Animals {
	
	public Dog(String name, int cuteness, int size, boolean swims) {
		this.name = name;
		this.size = 5;
		this.swims = true;
	}
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}
}
