package shapes;

abstract class Shape {
		abstract void draw();
	}
	class Line extends Shape{
		public void draw() {
		System.out.println("this is a line");
	}
	}

		class Rectangle extends Shape{
			public void draw() {
			System.out.println("this is a Rectangle");
		}
		}
			class Cube extends Shape{
				public void draw() {
				System.out.println("this is a cube");
			}
}
		
