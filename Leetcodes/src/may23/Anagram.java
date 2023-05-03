package may23;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "BNB";
		String b = "NBB";
		
		HashMap<Character,Integer> map1 = new HashMap<>();
		
		HashMap<Character,Integer> map2 = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
		
		for(int i=0;i<b.length();i++)
			map2.put(b.charAt(i), map2.getOrDefault(b.charAt(i), 0)+1);
		
		System.out.print(map1);
		System.out.print(map2);
		
		if(map1.equals(map2))
		{
			System.out.print("Anagram");
		}else
		{
			System.out.print("Not an Anagram");
		}
	}
	
	public static void anagramWithASCII()
	{
		String s = "BNB";
		String b = "NBB";
		
		int[] array1 = new int[52];
		int[] array2 = new int[52];
		
		
		char [] ch = s.toCharArray();
		char [] ch2 =  b.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			array1['a'-ch[i]]++;
			array2['a'-ch2[i]]++;
			
		}
		
		
		 if(Arrays.equals(array1, array2))
		 {
			 System.out.print("Anagram");
		 }
		
	}
	

}
