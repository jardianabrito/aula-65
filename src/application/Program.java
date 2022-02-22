package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Enter the measure triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measure triangle B: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println();
		System.out.printf("Triangle X: , %.4f%n", areaX);
		System.out.printf("Triangle X: , %.4f%n", areaY);
		System.out.println();
		
		
		if (areaX > areaY) {
			System.out.printf("Larger X, %.4f%n", areaX);
		}
		else {
			System.out.printf("Larger Y, %.4f%n", areaY);
		}
		
		sc.close();

	}

}
