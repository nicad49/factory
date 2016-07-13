package factory;

public class MainFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get an object of Circle and call its draw method
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		//call draw method of circle
		shape1.draw();
		
		
		//get an object of Rectangle and call its draw method
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		
		//get an object of Square and call its draw method
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();

	}

}
