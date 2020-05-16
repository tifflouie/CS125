
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pet sushi = new Pig("pigpig");
		Pet pigpig = new Dog("dogdog");
		Pet temp = pigpig;
		
		pigpig = sushi;
		sushi = temp;
		
		
		pigpig.speak();
		pigpig.talk();
		
		
		if (pigpig instanceof Dog) {
			System.out.println("i am dog");
		} else if (pigpig instanceof Cat) {
			System.out.println(" i am cat");
		} else if (pigpig instanceof Pig) {
			System.out.println(" i am pig");
		}


//		Cat shushu = new Cat("shushu");
//		shushu.printMe();
//		shushu.speak();
//		shushu.talk();
//
//		Dog chuchu = new Dog("chuchu");
//		chuchu.printMe();
//		chuchu.speak();
//		chuchu.talk();
//
//		Object bubu = chuchu;
//		System.out.println(bubu);

	}

}
