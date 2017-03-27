package ru.pft.firstjava;

public class HelloWorld {
	public static void main(String[] args) {
		hello("Daria");
		hello("User");
		double l = 5;
		System.out.println("Площадь квадрата со стороной " + l + " равняется " + area(l));

		double a = 4;
		double b = 880;
		System.out.println("Площадь прямоугольника со стороноами " + a + " и " + b + " равняется " + area(a, b));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + " !");
	}

	public static double area(double a) {
		return a*a;
	}

	public static double area(double a, double b){
		return a*b;
	}
}