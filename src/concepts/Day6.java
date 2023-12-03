package concepts;

public class Day6 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		int j = 2;
		while(j <= 20) {
			System.out.print(j + " ");
			j+=2;
		}
		System.out.println();
		int userNumber = 5;
		do {
			if(userNumber >= 1 && userNumber <= 10) {
				break;
			}
		}while(userNumber >= 1 && userNumber <= 10);
		System.out.println("You entered " + userNumber + ".");
	}

}
