package concepts;

public class Day7 {

	public static void main(String[] args) {
		int [] intArray = new int []{11, 10, 16, 5, 20};
		int sum = 0;
		double mean = 0.0;
		int maxNumber = intArray[0];
		int minNumber = intArray[0];
		
		for(int i = 0; i < intArray.length; i++) {
			sum+= intArray[i];
			if(maxNumber < intArray[i]) {
				maxNumber = intArray[i];
			}
			if(minNumber > intArray[i]) {
				minNumber = intArray[i];
			}
		}
		mean = (double)sum/intArray.length;
		System.out.println("Sum: " + sum);
		System.out.printf("Average: %.2f\n", mean);
		System.out.println("Maximum: " + maxNumber);
		System.out.println("Minimum: " + minNumber);
	}
}
