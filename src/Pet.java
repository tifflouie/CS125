
public class Pet {
	protected String name;
	protected String type;
	protected String sound;
	
	public void printMe() {
		System.out.println("I'm a " + type + " named " + name);
	}
	
	public void speak() {
		System.out.println("My sound is " + sound);
	}
	
	public void talk() {
		if(this instanceof Dog) {
			Dog me = (Dog) this;
			me.bark();
		} else if (this instanceof Cat) {
			Cat me = (Cat) this;
			me.meow();
		} else if (this instanceof Pig) {
			Pig me = (Pig) this;
			me.oink();
		}
		
		
	}
}
