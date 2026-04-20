package com.example.demo.calculator;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("""
					1. Addition (+)
					2. Subtraction (-)
					3. Multiplication (*)
					4. Division (/)
					5. EXIT
					Enter a Choice :
					""");
			int ch = sc.nextInt();
			
			if(ch==5) {
				System.out.println("Exit Thank You !!");
				break;
			}
			if(ch>=1 && ch<=4) {
				System.out.println("Enter Two Numbers : ");
				double num1 = sc.nextInt();
				double num2 = sc.nextInt();
				
				double result;
				
				switch (ch) {
				
				case 1 :
					result = num1 + num2;
					System.out.println("Additiion is : "+result);
					break;
					
				case 2:
					result = num1 - num2;
					System.out.println("Subtraction is :"+result);
					break;
					
				case 3 :
					result = num1 * num2;
					System.out.println("Multiplication is :"+result);
					break;
				case 4 :
					if (num2 == 0) {
						System.out.println("Cannot divide by zero ");
					}else {
						result = num1 / num2;
						System.out.println("Division is : " + result);
					}
					break;
				case 5 :
					System.exit(0);
				}
			}else {
				System.out.println("Invalid Choice !!");
			}
			
		} while (true);
	}

}
