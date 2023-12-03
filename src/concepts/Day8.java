package concepts;
import java.util.ArrayList;
import java.util.Scanner;


public class Day8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> groceryList = new ArrayList<>();
		System.out.println("Grocery List: ");
		
		while(true) {
			String item = scanner.nextLine();
			if(item.isEmpty()) {
				break;
			}
			
			if(item.contains("print")) {
				System.out.println(groceryList);
				continue;
			}
			
			if(item.contains("remove")) {
				String [] itemArray = item.split(" ");
				String removedItem = itemArray[1];
				groceryList.remove(removedItem);
				continue;
			}
			
			if(groceryList.contains(item)) {
				System.out.println("list already contains " + item);
				continue;
			}
			if(item.contains("clear")) {
				groceryList.clear();
				continue;
			}
			
			groceryList.add(item);
		}
		scanner.close();
	}

}
