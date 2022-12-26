package stack;

import java.util.Stack;

import org.junit.Test;

public class RemoveOutermostParentheses {
	@Test
	public void exampleData()
	{
		String s = "(()())(())(()(()))";
		removeOutermostParentheses(s);
	}
	
	@Test
	public void exampleData2()
	{
		String s = "(())";
		removeOutermostParentheses(s);
	}

	private void removeOutermostParentheses(String s) {
		// TODO Auto-generated method stub
		
		//(()())(())(()(()))

		Stack<Character> stack  = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i] == '(')
			{
				if(stack.size() >= 1) 
					{
					sb.append(ch[i]);
					}
	
				stack.push(ch[i]);
			}
			else
			{
				if(stack.size() > 1) 
					{
					sb.append(ch[i]);
					}
	
				stack.pop();
			}
		}
		
		
		System.out.print(sb.toString());
	}
	
	

}
