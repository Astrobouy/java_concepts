package concepts;
import java.util.*;
import java.lang.*;

public class Day9 {
	//Word Frequency Counter

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a few words:");
		String paragraph = scan.nextLine();
		String [] array = paragraph.split("\\W+");
		HashMap<String, Integer> map = new HashMap<>();
		
		int num = 1;
		for(int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i])) {
				
				map.put(array[i], num + 1);
			}else {
				map.put(array[i], num);
			}
		}
		ArrayList<String> list = new ArrayList<>();
		
		for(String strings: map.keySet()) {
			list.add(strings +  ": " + map.get(strings));
		}
		System.out.println(list);
		
		scan.close();
	}
}
