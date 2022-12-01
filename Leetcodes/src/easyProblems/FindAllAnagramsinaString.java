package easyProblems;

import java.util.HashMap;

import org.junit.Test;

public class FindAllAnagramsinaString {
	
	
	@Test
	public void exampleData1()
	{
		String s= "cbaebabacd", p = "abc";	
		
		findValidAnagramOptimized(s,p);
	}

	public void exampleData2()
	{
		String s= "efghacd", p = "abc";
		findValidAnagaram(s,p);
	}
	
	@Test
	public void exampleData3()
	{
		
		String s= "bacabac", p = "ab";
		findValidAnagaram(s,p);
	}
	
	
	public void findValidAnagaram(String s, String p)
	{
		
		HashMap<Character,Integer> map1 = new HashMap<>();
		
		HashMap<Character,Integer> map2 = new HashMap<>();
		
		char[] p1= p.toCharArray();
		char[] p2= s.toCharArray();
		
		for(int i=0;i<p1.length;i++) map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i),0)+1);
		
		for(int j=0;j<p2.length;j++) 
		{
			map2.put(s.charAt(j), map2.getOrDefault(s.charAt(j), 0)+1);
			//cbaebabacd
			
			if(j >= p1.length)
			{
				int len = j-p1.length;
				
				char ch = s.charAt(len);
				
				
				if(map2.get(ch)==1)
				{	
					map2.remove(ch);
				}else
				{
					map2.put(ch, map2.get(ch)-1);
				}
			}
			
			if(map2.equals(map1))
			{
			  int temp = p1.length-1;
				System.out.println("Anagram " + (j-temp));
			}
			

		}
		
		
	}
	
	
	public void findValidAnagramOptimized(String s, String p)
	{
		int sln = s.length();
		int pln= p.length();
		int i=0;
		int j=0;
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		
		for(;i<pln;i++) map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0)+1);
		
		for(;j<sln;j++) 
		{   
			
			map2.put(s.charAt(j), map2.getOrDefault(s.charAt(j), 0)+1);
			
			if(j>=pln)
			{ int len = j-pln;
				char ch = s.charAt(len);
			  
				if(map2.get(ch)==1)
				{
					map2.remove(ch);
				}else
				{
					map2.put(ch, map2.get(ch)-1);
				}
				
			}
			
			
			
			if(map2.equals(map1))
			{
				
				System.out.print("anagram ");
			}

			
		}
		
		
	}
}
