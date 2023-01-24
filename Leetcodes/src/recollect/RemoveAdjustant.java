package recollect;

import java.util.Stack;

import org.junit.Test;

public class RemoveAdjustant {
	
	@Test
	public void exampleData()
	{
		String s = "abbaca";
		
		remove(s);
		
	}

	private void remove(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(!stack.isEmpty() && stack.peek()== s.charAt(i))
			{
				stack.pop();
			}else
			{
				stack.push(s.charAt(i));
			}
		}
		
		for (Character character : stack) {
			
			System.out.print(character);
		}
	}

}
