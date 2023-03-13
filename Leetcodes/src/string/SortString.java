package string;

import org.junit.Test;

public class SortString {
	
	
	@Test
	public void sortCharacter()
	{
		String a = "zsdghbcda";
		
		char [] ch = a.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
							
				}
			}
		}
		
		System.out.print(ch);
		
		
	}

}
