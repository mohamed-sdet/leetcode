package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class DequeBasics {
	
	
	
	/*  We can use Deque 
	 * 
	 * Deque is an Interface we can create 
	 * 
	 */

	
	 public static void main(String arg[])
	 {
		 
		 
		 Deque<String> deque = new ArrayDeque<>();
		 
		   deque.add("Mohamed"); //add to the last
		   deque.addFirst("Ibrahim"); //add to the first 
		   deque.push("Mohamed1"); //add to the first 
		   deque.addLast("Mohamed2"); 
		   
		   System.out.println(deque);

		   
		   Deque<String> deque1 = new ArrayDeque<>();
		   
		   deque1.offer("Mohamed"); //add to the last
		   deque1.offerFirst("Ibrahim"); //add to the first 
		   deque1.offerLast("Mohamed1"); //add to the first 
		   deque1.addLast("Mohamed2"); 
		   
		   for(String s: deque)
		   {
			   
			   System.out.print(s);
		   }
			  Iterator<String> iter = deque.iterator();
		   while(iter.hasNext())
			  {
			   System.out.print(iter.hasNext()); 
				  
			  }
		   
		 
		   System.out.println(deque1);
		   
		   System.out.println(deque.peek());
		   System.out.println(deque.peekFirst());
		   System.out.println(deque.peekLast());
		   
		   System.out.println(deque.element());
		   
		   System.out.println(deque.getFirst());
		   System.out.println(deque.getLast());
		   
		   System.out.println(deque.poll());
		   System.out.println(deque.pollFirst());
		   System.out.println(deque.pollLast());
		   
		 //  System.out.println(deque.remove());
		 //  System.out.println(deque.removeFirst());
		  // System.out.println(deque.removeLast());
		   
		   System.out.print(deque.contains("mohamed"));
		   
		   Stack<String> stack = new Stack<>();
		   
		   stack.peek();
		   
	
		  
		  
		   
	 }
}
