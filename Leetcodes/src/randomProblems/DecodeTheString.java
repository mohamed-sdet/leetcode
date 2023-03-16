package randomProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class DecodeTheString {

	
	/*
	 * 2.decoding problem without brackets
		input = "2abc3ab"
		output=”abcababababcababab”
	 */
	
	@Test
	public void exampleData()
	{
		
		String input = "2[ab]3[bc]";
		
		decodetheString(input);
	}

	private void decodetheString(String input) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack = new Stack<>();
		
		char [] ch = input.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if( ch[i] !=']')
			{
				stack.push(ch[i]);
			}
			else
			{
				List<Character> list  = new ArrayList<>();
				
				while(stack.peek() !='[')
				{
					list.add(stack.pop());
				}
				
				stack.pop();
				
				int k = 1;
				
				if(!stack.isEmpty() && Character.isDigit(stack.peek()) )
				{
					k = Character.getNumericValue(stack.pop());
				}
				
				while(k>0)
				{
					for(int j=list.size()-1;j>=0;j--)
					{
						System.out.print(list.get(j));
						
					    stack.add(list.get(j));
					}
					k--;
				}
				
			}
		}
		
		System.out.print(stack);
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty())
		
		{
			sb.append(stack.pop());
		}
		
		System.out.println("reversed"+sb.reverse());
		
	}
	
	
}
