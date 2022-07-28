package wk5_day1_hw2;

public class Calculator
{

	public Calculator()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		System.out.println("add: " + add(4, 5));
		System.out.println("subtract: " + subtract(4, 2));
		System.out.println("multiply: " + multiply(4, 2));
		System.out.println("divide: " + divide(4, 2));
		System.out.println("square: " + square(3));

	}
	
	public static int add(int num1, int num2) {
		
		return num1 + num2;
		
	}
	
	public static int subtract(int num1, int num2) {
		
		return num1 - num2;
		
	}
	
	public static int multiply(int num1, int num2) {
		
		return num1 * num2;
		
	}
	
	public static int divide(int num1, int num2) {
		
		return num1 / num2;
		
	}
	
	public static int square(int num1) {
		
		return num1 * num1;
		
	}

}
