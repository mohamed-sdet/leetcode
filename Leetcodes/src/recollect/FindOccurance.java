package recollect;

import org.junit.Test;

public class FindOccurance {
	
	@Test
	public void exampleData()
	{
		
		String s = "aaabbcccddee";
		
		findOccurancetwoPointer(s);
	}

	/*
	private void findOccurance(String s) {
		// TODO Auto-generated method stub
		
		String  output="";
		int counter =0;
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<s.length();j++)
			{
				 if(s.charAt(i)==s.charAt(j))
				 {
					
				 }
			}
		}
		
	}
	*/
	
	private void findOccurancetwoPointer(String s)
	{
		
		int left=0;
		int right=0;
		StringBuffer sb = new StringBuffer();
		
		while(right<s.length())
		{
			if(s.charAt(left)== s.charAt(right))
			{
				right++;
			}else 
			{  
				int val = right-left;
				String s1 = s.charAt(left)+String.valueOf(val)  ;
				sb= sb.append(s1);
				left = right;
				System.out.println(sb.toString());
				
			}
			if(right==s.length())
			{
				System.out.println(sb.toString());
				int val = right-left;
				String s1 = s.charAt(left)+String.valueOf(val) ;
				sb= sb.append(s1);
			}
		}
		
		
		
	}
}
