package randomProblems;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class SortCharacterByASCII {

	
	@Test
	public void exampleData()
	{
		/*
		 * /*Given an char array as char[] arr ={'a','b','c',d','s','t','u',v'} based on ascii valures return an array the last 4 highest values.
					O/p : {'v','u','t','s'}*/
		
		char[] arr ={'a','b','c','d','s','t','u','v'};
		
		countASCII(arr);
		
	}

	private void countASCII(char[] arr) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		
		char[] four = new char[4];
		
		for(int i=arr.length-1;i>(arr.length-1) - 4;i--)
		{
			System.out.print(arr[i]);
		}
		
		
	}
	
}
