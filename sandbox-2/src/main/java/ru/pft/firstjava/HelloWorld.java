package ru.pft.firstjava;

public class HelloWorld {
	public static void main(String[] args) {
		hello("Daria");
		hello("User");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " равняется " + s.area());

		Rectangle r = new Rectangle(4, 880);
		System.out.println("Площадь прямоугольника со стороноами " + r.a + " и " + r.b + " равняется " + r.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + " !");
	}
}