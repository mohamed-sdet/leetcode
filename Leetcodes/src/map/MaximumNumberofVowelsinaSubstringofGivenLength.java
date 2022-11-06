package map;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
	
	
	@Test
	public void examplePositiveData()
	{
		
		String s = "abciiidef";
		int k = 3;
		MaximumNumberofVowelsinaSubstringofGivenLength(s,k);
		
	}
	@Test
	public void examplePositiveData1()
	{
		
		String s = "aeiou";
		int k = 2;
		MaximumNumberofVowelsinaSubstringofGivenLength(s,k);
		
	}
	@Test
	public void examplePositiveData2()
	{
		
		String s = "leetcode";
		int k = 3;
		MaximumNumberofVowelsinaSubstringofGivenLength(s,k);
		
	}

	private void MaximumNumberofVowelsinaSubstringofGivenLength(String s, int k) {
		// TODO Auto-generated method stub
		
		int count=0,max=0;
		HashSet<Character> vowels =new  HashSet<>(Arrays.asList('a','e','i','o','u'));
		
		for(int i=0;i<k;i++)
		{
			if(vowels.contains(s.charAt(i)))
			count++;
			
		}
		max=Math.max(count, max);
		for(int j=k;j<s.length();j++)
		{
			if(vowels.contains(s.charAt(j)))
			{ 
				count++;
			}
			if(vowels.contains(s.charAt(j-k)))
			{
				count--;
			}
			max= Math.max(count,max );
		}
		System.out.print(max);
		
	}

}
