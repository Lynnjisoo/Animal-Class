
public class Rabbit {
	
	String name;
	int size;
	boolean swims;
	int cuteness;

	public Rabbit (String name, int size, boolean swims) {
		this.name = name; 
		this.size = 7;
		this.swims = true;
		this.cuteness = 10;
	}
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}
	public void cuteness(){
		System.out.println(this.name + ": Look at my cute face!");
	}

}
