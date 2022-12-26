package twoPointers;

import java.util.Arrays;

import org.junit.Test;

public class ShortestDistancetoaCharacter {
	
	@Test
	public void example()
	{
		
		String s = "loveleetcode";
		String c = "e";
		
		expandFromCenter(s,c);
		
	}

	private void expandFromCenter(String s, String c2) {
		// TODO Auto-generated method stub
		
		int len = s.length();
		int out[] = new int[len];
		char [] in = s.toCharArray();
		char c= c2.charAt(0);
		int count=0;
		//"loveleetcode"
		for(int i=0;i<len;i++)
		{
			int left=i-1;
			int right=i+1;
			
			while(left>=0 || right<len)
			{
				if(in[i]==c)
				{
					out[count++]=0;
					break;
				}
				else if(left>=0 && in[left]==c )
				{
					out[count++]= i-left+1;
				}
				else if(right<=len && in[right]==c )
				{
					out[count++]= right-i;
					break;
				}
				right++;
				left--;
			}

		}
		
		System.out.print(Arrays.toString(out));
	}
	
	
	

}
