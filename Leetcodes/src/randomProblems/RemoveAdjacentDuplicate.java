package randomProblems;

import java.util.Stack;

import org.junit.Test;

public class RemoveAdjacentDuplicate {
	
	
	
	@Test
	public void exampleData()
	{
		String data ="abbccd";
		
		removeAdjacentDuplicate(data);
	}

	private void removeAdjacentDuplicate(String data) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack = new Stack<>();
		
		char[] ch = data.toCharArray();
		
		for(int i=0;i<ch.length;i++ )
		{
			 if (!stack.isEmpty() && stack.peek() == ch[i])
			{
				stack.pop();
			}else
			{
				stack.push(ch[i]);
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty())
		{
			sb.append(stack.pop());
		}
		
		System.out.print(sb.reverse());
		
	}

}
