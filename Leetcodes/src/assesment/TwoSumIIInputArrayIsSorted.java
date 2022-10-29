package assesment;

import org.junit.Test;

public class TwoSumIIInputArrayIsSorted {
	
	
	
	/*Brute Force 
	 * Initialize for loop with integer i with length of given input numbers
	 * Initialize another for loop with interger j with i value with length of numbers 
	 * compare sum i+j   if sum is equal to k then store the indices of i and j in output array 
	 * 
	 * 
	 * Two Pointer Approach 
	 * Start this solution using two pointer algorithm
	 * Initialize start as 0 and end as length-1
	 * start while loop start <= num length end >=0
	 *  if sum = gtreater than k start ++ else lesser end++
	 * then return 
	 * 
	 */
	
	@Test
	public void examplepositiveData()
	{
		int[] numbers = {2,7,11,15};
		int target =9; 
		//twoSumIIInputArrayIsSortedBruteForce(numbers,target);
		twoSumIIInputArrayIsSortedBruteForcetwopointer(numbers,target);
	}
	
	public void exampleEdgeData()
	{
		int[] numbers = {2,7,11,15};
		int target =6; 
		twoSumIIInputArrayIsSortedBruteForce(numbers,target);
		
	}

	
	public void exampleNagativeData()
	{
		int[] numbers = {-1,0};
		int target =-1; 
		twoSumIIInputArrayIsSortedBruteForce(numbers,target);
		
	}
	
	private int[] twoSumIIInputArrayIsSortedBruteForce(int[] numbers, int target) {
		// TODO Auto-generated method stub
		
		 int sum=0;
			int [] output = new int[2];
			for(int i=0;i<numbers.length;i++)
			{
				
				for(int j=i+1;j<numbers.length;j++)
				{
					sum=numbers[i]+numbers[j];
					
					if(sum==target)
					{
					
						output[0]=i+1;
						output[1]=j+1;
						
						
					}

				}
				
				
			}
	        return output;
		
	}

	
	/*public int[] twoSumIIInputArrayIsSortedBruteForcetwopointer(int[] numbers, int target)
	{
		int[] output = new int[2];
		int sum= 0;
		int start =0;
		int end =  numbers.length-1;
		
		while(start<end)
		{
			
			sum= numbers[start]+numbers[end];
			
			if(sum==target)
			{
				
				output[0]=start+1;
				output[1]=end+1;
				System.out.print(start +" "+ end);
				
				break;
				
			}
			else if(sum<target) 
				{
				start++;
				}
				else  
				{
				end--;
				}
			
				
		
	}
		return output;
	
}
*/
}
