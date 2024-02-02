package TestNumTwo;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {
		Scanner textfirst = new Scanner(System.in); 
			
		System.out.println("Введите две строки с текстом:");
		
		String line1 = textfirst.nextLine();
		String line2 = textfirst.nextLine();
		
		if(line1.equals(line2)){
		  System.out.println("Строки идентичны");
	    }else{
	      System.out.println("Строки неидентичны");
	    }
		
		
		
	}

}
