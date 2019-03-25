package ArrayVList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayVList {
	public static void main(String[] args) {
	 String StringOfColors[] = {"red","blue","yellow"};
	 
	 for (int i = 0; i < StringOfColors.length; i++)
		 System.out.println(StringOfColors[i]);
	 
	 //just showing a two dimensional array
	 String[][] twoDArray = new String[3][3];
	 
	 /* very specific because I say ArrayList rather than just List. a "special type of lightbulb"*/
	 ArrayList<String> listOfColors = new ArrayList<String>();
	 
	 /*I want a just a light bulb, any kind*/
	 List<String> listOfColors2 = new ArrayList<String>();
	 
	 listOfColors.add("red");
	 listOfColors.add("blue");
	 listOfColors.add("yellow");
	 System.out.println("Hey Matt, it's future matt. Just checking in. Stay safe. Cheers.");
	 System.out.println("Do you have anything to say to him?");
	 Scanner reader = new Scanner(System.in);
	 String yourPick = reader.nextLine();
	 reader.close();
	 System.out.println('"'+ yourPick + '"');
	 System.out.println("me too, thanks");
	
	 //just examples of getting size and getting specific value of array location
	 int s = listOfColors2.size();
	 String blue = listOfColors.get(1);
	 
	 MyList colors = new MyList();
	 
	 colors.add("Yellow");
	 colors.add("Blue");
	 colors.add("Red");
	 colors.add("Green");
	 colors.add("Black");
	 
	 for (int i = 0; i < colors.size(); i++) {
		 System.out.println(i + " " + colors.get(i));
	}
	 
	 String red = colors.get(2);
	 int s2 = colors.size();
	 
	 colors.remove(4);
	 
	 for (int i = 0; i < StringOfColors.length; i++) {
		 System.out.println(i + " " + colors.get(i));
	 }
	 
	}
	
	public static class MyList {
		
		String[] store = new String[10];
		int size = 0;
		
		/**
		 * Adds a string to the list
		 * @param s the string to add to the list
		 */
		public void add(String s) {
			//figure out the add logic
			
			if(size == store.length) {
				String[] tmp = new String[size+10];
				
				for(int i = 0; i < store.length; i++) {
					tmp[i] = store[i];
				}
				
				store = tmp;
				
			}
			store[size] = s;
			
			size += 1;
			
		}
		
		/**
		 * Returns the current size of the list
		 * @return the current size of the list
		 */
		public int size() {
			return size;
		}
		
		/**
		 * Returns the string at the position passed in
		 * @param i the position passed in 
		 * @return the string at the position
		 */
		public String get(int i) {
			return store[i];
		}
		
		/**
		 * Removes the element from the list at the given position
		 * @param i the position to remove from the list
		 */
		public void remove(int i) {
			//figure out the remove element logic
			if(i > size) {
				return;
			} else {
				String[] tmp = new String[size];
				for(int j = 0; j < size-1; i++) {
					if(j != i) {
						tmp[j] = store[i];
					}
				}
				
				store = tmp;
				store[size] = null;
				size -= 1;
			}
			
		}
	}
	
	
}
