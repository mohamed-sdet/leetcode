package randomProblems;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CountAlphabets {
	
	
	@Test
	public void examplePostiveData()
	{
		String input = "aaabbccaad";
	    String output = "a3b2c2a2d1";
	    
	    countCharacters(input);
	    
	}

	private void countCharacters(String input) {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<>();
		//StringBuffer sb = new StringBuffer();
		
		String output = "";
		int counter =1;
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i)== input.charAt(j))
				{
					counter++;
				}else
				{
					output += String.valueOf(input.charAt(i)) + counter ;
					i = j-1;
					counter =0;
					break;
				}
			}
		}
		System.out.print(output);
		
	}
	
	public static void countEachChar(String input) {
		char[] chArr = input.toCharArray();
		   StringBuffer sbf = new StringBuffer();
		   int left = 0, right = 0;
		   
		   while(left <= right ){
				if(chArr[left] == chArr[right])
					right++;
				else if(chArr[left] != chArr[right]){
					sbf.append(input.charAt(left)).append(String.valueOf(right - left));
					left = right;
				}
				
				if(right == chArr.length){
					sbf.append(input.charAt(left)).append(String.valueOf(right - left));
					break;
				}
		   }
		   	System.out.println(sbf.toString());
	}

}
