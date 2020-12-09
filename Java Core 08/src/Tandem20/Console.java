package Tandem20;

import java.util.Scanner;

public class Console {
public static void main(String[] args) {
	runScanner();
}

private static void runScanner() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Введіть число");
	double number = scanner.nextDouble();
	if(number % 1 == 0) {
		System.out.println("Ціле");
	if(number % 2 ==0) {
		System.out.println("Парне");	
	} else {
		System.out.println("Не парне");
	}
		
	}
	
	
	
}
}
