package assesment;

import java.util.HashMap;

import org.junit.Test;

public class CircularPrinter {
	
	@Test
	public void examplePositiveData()
	{
		String s = "BZA";
		
		circularPrinterEasy(s);
		
	}
	@Test
	public void examplePositiveData1()
	{
		String s = "AZGB";
		
		circularPrinterEasy(s);
		
	}
	@Test
	public void exampleEdgeData1()
	{
		String s = "ZNMD";
		
		circularPrinterEasy(s);
		
	}


	private void circularPrinter(String s) {
		// TODO Auto-generated method stub
		 
		
		HashMap<Character,Integer> frw = new HashMap<>();
		HashMap<Character,Integer> rev = new HashMap<>();
		int count =0;int count1=1;int sum=0;char pre='A';
		
		for(char i='A';i<='Z';i++) frw.put( i, count++);
		for(char j='Z';j>='A';j--) rev.put(j, count1++);
         System.out.println(frw);
         System.out.println(rev);
		
		for(int k=0;k<s.length();k++)
		{
			 char ch= s.charAt(k);
			
			if(frw.get(ch)<rev.get(ch))
			{
				sum = sum + frw.get(s.charAt(k));
			}else 
			{
				sum = sum+rev.get(s.charAt(k));
			}
		}
		System.out.println(sum);
 		
	}

	
	private void circularPrinterEasy(String s)
	
	{
		char [] ch= s.toCharArray();
		
		int count =65;
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			
			sum += Math.min(Math.abs(count-ch[i]), 26-Math.abs(count-ch[i]));
			count =  ch[i];
		}
		
		System.out.print(sum);
		
	}
}
