package map;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class NumberofEquivalentDominoPairs {
	
	@Test
	public void examplepositiveData()
	{
		int [][]  dominoes = {{1,2},{2,1},{3,4},{5,6}};
		
		NumberofEquivalentDominoPairs(dominoes);
		
	}
	
	@Test
	public void exampleEdgeData()
	{
		int [][]  dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
		
		NumberofEquivalentDominoPairs(dominoes);
		
	}
	@Test
	public void exampleNegativeData()
	{
		int [][]  dominoes = {{1,1},{1,1},{1,1},{1,1},{1,1}};
		
		NumberofEquivalentDominoPairs(dominoes);
		
	}

	private void NumberofEquivalentDominoPairs(int[][] dominoes) {
		// TODO Auto-generated method stub
		
		HashSet <Integer> set1 = new HashSet <Integer>();
		HashSet <Integer> set2 = new HashSet <Integer>();
		
		int output = 0;
		

		for(int i=0;i<dominoes.length;i++)
		{
			int [] one = dominoes[i];

			for(int arr : one )
				set1.add(arr);
			
			for(int j=i+1;j<dominoes.length;j++)
			{
				int [] two = dominoes[j];
				
				for(int arr : two )
					set2.add(arr);
				if(set1.equals(set2))
				 {
					 output+=1;
				 }
				set2.clear();
			}
			 
			 
			 set1.clear();
			 
			
		}
		System.out.print(output);
		
	}

}
