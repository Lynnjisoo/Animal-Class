
public class Rabbit extends Animals {
	


	public Rabbit (String name, int size, boolean swims) {
		super (name, size, swims);
	}
	
	
	public void swim(){
		System.out.println(this.name + ": swim swim!");
	}
	public void cuteness(){
		System.out.println(this.name + "Look at that cute rabbit!");
	}

}
