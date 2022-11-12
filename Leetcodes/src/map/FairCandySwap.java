package map;

import java.util.HashSet;

import org.junit.Test;

public class FairCandySwap {

	
	/*https://leetcode.com/problems/fair-candy-swap/
	 *Iterate the given  input bobsizes 
	 * Add the bobsizes in the set 
	 * while adding store the sum of the bob size in array 
	 * Sub the bsum and asum then divide by 2
	 * now check the vales in set 
	 * if set has the value return 
	 * 
	 */
	
	@Test
	public void examplePositiveData()
	{
		int[] aliceSizes = {1,1}, bobSizes = {2,2};
		
		int[] i = FairCandySwap(aliceSizes,bobSizes);
	}

	private int[] FairCandySwap(int[] aliceSizes, int[] bobSizes) {
		// TODO Auto-generated method stub
		
		
		  HashSet<Integer> set = new HashSet<>();
	        
	        int aSum=0,bSum=0,diff=0;
	        
	        for(int i=0;i<bobSizes.length;i++)
	        {
	            set.add(bobSizes[i]);
	            bSum= bSum+ bobSizes[i];
	            
	        }
	        
	        for(int i=0;i<aliceSizes.length;i++)
	        {
	            aSum= aSum+aliceSizes[i];
	        }
	        
	        diff= bSum-aSum/2;
	        
	        for(int i=0;i<aliceSizes.length;i++)
	        {
	          if(set.contains(aliceSizes[i]+diff))
	          {
	              
	              return new int[]{(aliceSizes[i]),(aliceSizes[i]+diff)};
	              
	          }
	        }
			return null;
	}
	
	
	
}
