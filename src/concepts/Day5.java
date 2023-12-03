package concepts;
import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what would you like to calculate?");
		
		if(scanner.hasNextInt()) {
			int num1 = scanner.nextInt();
			char operator = scanner.next().charAt(0);
			int num2 = scanner.nextInt();
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + Calculator(num1, operator, num2));
		}else {
			System.out.println("Not a number");
		}
		
		
		scanner.close();
	}
	
	public static int Calculator(int num1, char operator, int num2) {
		int result = 0;
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
			
		default:
			System.out.println("Incorrect input");
			break;
		}
		return result;	
	}

}
