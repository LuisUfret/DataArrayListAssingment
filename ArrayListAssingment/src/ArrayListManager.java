import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListManager {
	static ArrayList<Integer> list = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Gretting message
		System.out.println("Welcome to the ArrayList Manager!" + "\n" + "Choose how you want to modify the list.");
		
		//Main loop
		boolean finish = false;
		while(!finish) {
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("1. Add a number to the list.");
			System.out.println("2. Remove all intances of a specified number.");
			System.out.println("3. Print the size of the list.");
			System.out.println("4. Terminate.");
			int mainMenuChoice = keyboard.nextInt();
			int input;
			System.out.println();
			switch(mainMenuChoice) {
			
			case 1:
				System.out.println("Enter an integer: ");
				 input = keyboard.nextInt();
				 list.add(input);
				 System.out.println(list.toString());
				 break;
				 
			case 2:
				System.out.println("Enter an integer to remove all intances of it from the list: ");
				input = keyboard.nextInt();
				for(int index= 0; index < list.size()-1; index++) {
					if(list.get(index) == input) {list.remove(index);}
					else {continue;}
					
				}System.out.println(list.toString());
				
				break;
				
			case 3: 
				System.out.println("The size of the list is " + list.size());
				System.out.println();
				break;
				
			case 4:
				finish = true;
				System.out.println("Thank you for using this application.");
				break;
			}
			

		}

	}

}
