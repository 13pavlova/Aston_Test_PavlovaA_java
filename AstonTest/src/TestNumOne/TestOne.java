package TestNumOne;
import java.util.Scanner;

public class TestOne {

	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in); 
		
		System.out.println("Введите два числа:");
		
		int a = ab.nextInt();
		int b = ab.nextInt();
		
		System.out.println("Сложение: "+(a+b));
		System.out.println("Вычитание: "+(a-b));
		System.out.println("Деление: "+(a/b));
		System.out.println("Умножение: "+(a*b));

		if (a < b) {
		    System.out.println("a < b");
		} else if (a > b) {
		    System.out.println("a > b");
		} else {
		    System.out.println("a = b");
		}
		
		
	}

}
