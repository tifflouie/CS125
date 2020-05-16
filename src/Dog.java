
public class Dog extends Pet{
	Dog(String name) {
		this.name = name;
		this.type = "Dog";
		this.sound = "roof roof";
	}
	
	public void printMe() {
		System.out.println("My dog is owie");
	}
	
	public void bark() {
		System.out.println("Bark");
	}
}
