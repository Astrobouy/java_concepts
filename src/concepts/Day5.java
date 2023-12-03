package concepts;


public class Day5 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		char operator = '/';
		
		System.out.println("" + num1 + " " + operator + " " + num2 + " = " + Calculator(num1, operator, num2));
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
		}
		return result;	
	}

}
