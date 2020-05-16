
public class CompareRectangleArea {

	/*public static boolean isMyAreaGreater( int width, int height, int yourarea) {
		
		if ((width * height) > yourarea) {
			return true;
		} else {
			return false;
		}
	}*/
	
	public static boolean isMyAreaGreater (Rectangle rectangle, int yourarea) {
		
		return rectangle.area() > yourarea;
		/*if (rectangle.area() > yourarea) {
			return true;
		} else {
			return false;
		}*/
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle();
		rectangle.height = 10;
		rectangle.width = 5;
		
		/*int width = 5;
		int height = 10;*/
		int yourarea = 25100;
		
		//System.out.println(isMyAreaGreater(width, height, yourarea));
		System.out.println(isMyAreaGreater(rectangle, yourarea));
	}

}
