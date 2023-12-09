package concepts;
import java.util.*;

public class Day10 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(10);
		set.add(15);
		System.out.println("Original set: " + set);
		
		set.add(10);
		System.out.println("Attempting to add 10 to the current set: " + set);
		
		set.add(20);
		System.out.println("Adding 20 to the set if it does not exist: " + set);
		
		set.remove(5);
		System.out.println("Removing 5 from the set if it exists: " + set);
		
		set.remove(25);
		System.out.println("Removing 25 from the set if it exists: " + set);
		
		System.out.println("Set contains(10): " + set.contains(10));
		
		System.out.println("Set contains(25): " + set.contains(25));
		
		System.out.println("Size of set: " + set.size());
		
		System.out.println("Is the set empty? " + set.isEmpty());
		
		
		
	}

}
