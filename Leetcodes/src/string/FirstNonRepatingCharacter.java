package string;

import org.junit.Test;

public class FirstNonRepatingCharacter {
	
	//Java Program To Find First Non Repeated Character 
	
	@Test
	public void exampleData()
	{
		String s = "abcdacdcz";
		
		char [] ch = s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			boolean re = true;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					re = false;
					break;
				}
			}
			
			if(re)
			{
				System.out.print(ch[i]);
				break;
			}
		}
		
	}

}
