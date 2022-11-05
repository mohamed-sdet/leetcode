package arrays;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Anagram {
	
	@Test
	public void examplePositiveData()
	{

		String s = "cbaebabacd", p = "abc";
		findAllAnagramsinaString(s,p);
	}

	private void findAllAnagramsinaString(String s, String p) {
		// TODO Auto-generated method stub
		
		int slen= s.length(), plen=p.length();
		
		char [] sch =new char[plen];
		char [] pch = p.toCharArray();
		
		List<Integer> output = new ArrayList<Integer>();
		
	
			for(int i=0;i<slen;i++)
			{
				sch[i]= s.charAt(i);
				
				if(i>=plen)
				{
					int temp = s.indexOf(i-plen);
					
				}
			}
			for(int j=0;j<slen;j++)
			{
				for(int k=0;k<plen;k++)
				{
					if(sch[j]==pch[k])
					{
						System.out.print(j);
					}
					
				}
				
			}
			
			System.out.print(output);
		
	}

}
