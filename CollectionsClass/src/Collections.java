import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.HashSet;


public class Collections {
	public static void main(String[] args) {
		Collection<Integer> intCollection = new HashSet<>();
		System.out.println("Hey Matt. Future Matt again. DON'T eat the snacks. Your life depends on it. Cheers.");
		Random randNumGen = new Random();
		for (int i=0; i <10000; i++) {
			intCollection.add(randNumGen.nextInt(1000));
		}
		
		Iterator<Integer> iterator = intCollection.iterator();
		
		while(iterator.hasNext()) {
			int number = iterator.next();
			//System.out.println(number);
		}
		
		///////////////////////////////////////////
		//structure that implements stack interface. return biggest element in stack
		//answer is actually to have two stacks a read and mirror, as you add to read stack, you challenge and add the
		//largest to the mirror stack, everytime you add to original stack, keep push() current largest to mirror stack
	

		Collection<Integer> stack = new Stack<>();
		
		for (int i=0; i <10000; i++) {
			stack.add(randNumGen.nextInt(1000));
		}
		
		Iterator<Integer> iter = stack.iterator();
		int currentMax = iter.next();
		System.out.println(currentMax);
		
		while (iter.hasNext()){
			if (iter.next() >= currentMax) {
				currentMax = iter.next();;
			}
		}
		
		System.out.println(stack);
		System.out.println(currentMax);
				
		
	}
	
	
}
