package recollect;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

public class IsValidBracket {
	
	@Test
	public void exampleData()
	{
		//String s = "{}";
		String s ="{[}]";
		
		System.out.print(valid(s));
	}

	private void validBraket(String s) {
		// TODO Auto-generated method stub
		
		
		HashMap<Character,Character> map = new HashMap<>();
		
		map.put('}', '{');
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				if(!stack.isEmpty() && stack.pop() != map.get(s.charAt(i)))
				{
					System.out.print("Brakets are Invalid");
				}
			}else 
			{
				stack.push(s.charAt(i));
			}
		}
		
		if(stack.empty())
		{
			System.out.print("Brakets are valid");
		}else 
		{
			System.out.print("Brakets are INvalid");
		}
		
	}

	
	private boolean valid(String str)
	{
		Stack<Character> stack = new Stack<Character>();

		char[] chArr = str.toCharArray();

		for(int i = 0; i < chArr.length; i++){

			
			//{}
		if(!stack.isEmpty() && chArr[i] == '}' && stack.peek() == '{' )
			stack.pop();
		//else if(!stack.isEmpty() && chArr[i] == ']' && stack.peek() == '[' )
			//stack.pop();
		//else if(!stack.isEmpty() && chArr[i] == ')' && stack.peek() == '(' )
			//stack.pop();
		else
			stack.push(chArr[i]); //{
		}

		if(stack.isEmpty())
			return true;
		else 
			return false;
	}
}
