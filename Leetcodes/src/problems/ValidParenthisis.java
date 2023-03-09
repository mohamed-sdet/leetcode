package problems;

import java.util.Stack;

import org.junit.Test;

public class ValidParenthisis {
	
	@Test
	public void exampleData()
	{
		String s = "{([])}";
		
		validParenthensis(s);
		
	}

	private void validParenthensis(String s) {
		// TODO Auto-generated method stub
		
		
		Stack<Character> stack = new Stack<>();
		
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) =='{' || s.charAt(i) =='(' || s.charAt(i) == '[')
			{
			   stack.push(s.charAt(i));
			}else if(s.charAt(i) =='}' && stack.peek()=='{')
			{
				stack.pop();
				
			}
			else if(s.charAt(i) ==')' && stack.peek()=='(')
			{
				stack.pop();
				
			}
			else if(s.charAt(i) ==']' && stack.peek()=='[')
			{
				stack.pop();
				
			}
			
		}
		if(stack.isEmpty())
		{
			System.out.println("valid");
		}else 
		{
			System.out.print("Invalid");
		}

	}

}
