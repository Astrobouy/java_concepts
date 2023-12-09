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
		for(String word: array) {
			if(map.containsKey(word)) {
				
				map.put(word, num + 1);
			}else {
				map.put(word, num);
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
