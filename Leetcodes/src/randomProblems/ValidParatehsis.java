package randomProblems;

import java.util.Stack;

import org.junit.Test;

public class ValidParatehsis {

	
	@Test
	public void exampleData()
	{
		
		String data = "{}{}{{{}}";
		
		validParanthisis(data);
		
	}

	private void validParanthisis(String data) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack = new Stack<>();
		
		char [] ch = data.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(!stack.isEmpty() && ch[i] == '}' && stack.peek() =='{')
			{
				stack.pop();
				
			}else
			{
				stack.push(ch[i]);
			}
			
		}
		
		if(stack.isEmpty())
		{
			System.out.print("Valid");
		}else
		{
			System.out.print("Invalid");
		}
		
	}
	
}
