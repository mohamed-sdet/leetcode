package randomProblems;

import org.junit.Test;

public class CountOnlyNumber {
	
	
	@Test
	public void exampleData()
	{
		String s = "Test123test456ABC";
				
		counteOnlyNumber(s);
		
	}

	private void counteOnlyNumber(String s) {
		// TODO Auto-generated method stub
		
		int sum =0;
		
		String sh = "";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				char ch = s.charAt(i);
				
				sh += ch;
			}else
			{
				if(sh.length()>0)
				{
					sum += Integer.parseInt(sh);
					sh ="0";
				}
				
				
			}
		}
		
		System.out.print(sum + Integer.parseInt(sh));
	}

}
