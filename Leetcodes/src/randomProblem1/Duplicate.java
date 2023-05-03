package randomProblem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dup[] = {1,2,3,4,5,3,2,6};
		
		System.out.print(Arrays.toString(duplicate(dup)));
		
	/*	
		
		for(int i=0;i<dup.length;i++)
		{
			for(int j=i+1;j<dup.length;j++)
			{
				if(dup[i] == dup[j])
				{
					//System.out.println(dup[i]);
				}
				
			}
		}
		
		*/

	}
	
	

	public static int[] duplicate(int [] dup)
	{
		
		List<Integer> dupsValue = new ArrayList();
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i =0;i<dup.length;i++)
		{
			if(!set.add(dup[i]))
			{
				dupsValue.add(dup[i]);
			}
		}
		
		
	     int out[] = new int [dupsValue.size()];
	     
		for(int j=0;j<dupsValue.size();j++)
		{
			out[j] = dupsValue.get(j);
		}
		
		return out;
		
	}

}
