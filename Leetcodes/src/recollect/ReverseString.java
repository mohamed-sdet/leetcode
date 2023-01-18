package recollect;

import org.junit.Test;

public class ReverseString {
	
	
	@Test
	public void exampleData()
	{
		String s = "Mohamed";
		
		reverseString(s);
		reverseStringTwopointer(s);
	}

	private void reverseString(String s) {
		// TODO Auto-generated method stub
		
		String b = "" ;
		for(int i=s.length()-1;i>=0;i--)
		{
			 b = b + s.charAt(i);
			
		}
		
		System.out.println(b);
	}


   private void reverseStringTwopointer(String s)
   {
	   char[] ch = s.toCharArray();
	   
	   int left =0;
	   int right =s.length()-1;
	   
	   while (left<right)
	   {
		   char temp = ch[right];
		   ch[right--] = ch[left];
		   ch[left++] = temp;
	   }
	   
	   System.out.println(String.valueOf(ch));
	   
   }

}
