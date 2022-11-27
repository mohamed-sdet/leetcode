package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeBasics {
	
	
	
	/*  We can use Deque 
	 * 
	 * Deque is an Interface we can create 
	 * 
	 */

	
	 public static void main(String arg[])
	 {
		 
		 
		 Deque<String> deque = new ArrayDeque<>();
		 
		   deque.add("Mohamed");
		   deque.addFirst("Ibrahim");
		   deque.push("Mohamed1");
		   
		   System.out.print(deque);
		 
	 }
}
