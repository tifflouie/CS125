
public class Pig extends Pet{
	Pig(String name) {
		this.name = name;
		this.type = "pig";
		this.sound = "oink oink";
	}
	
	public void oink() {
		System.out.println("Oink");
	}
}
