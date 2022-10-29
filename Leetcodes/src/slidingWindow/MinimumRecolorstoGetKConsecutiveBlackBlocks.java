package slidingWindow;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
	
	
	
	
	private static final int Interger = 0;

	/*
	 * Traverse using for loop untill k
	 * while if nums[i] ==w counter ++ 
	 * then get min value 
	 * use another for loop intialize from K value until num length 
	 * while iterating check if if num[k]== w then counte++
	 * if nums[left ]== w conter -- start ++
	 * sotre max
	 * then return  
	 
	 */
			 
			 
			 
		public void examplePostive()
		{
		 
			String block ="WBBWWBBWBW";
			int k=7;
			
		 
			MinimumRecolorstoGetKConsecutiveBlackBlocks(block,k);
		}

	private void MinimumRecolorstoGetKConsecutiveBlackBlocks(String block,int k) {
		// TODO Auto-generated method stub
		char [] s = block.toCharArray();
		int min = Integer.MAX_VALUE;
		int left=0;
		int counter=0;
		
		for(int i=0;i<k;i++)
		{
			if(s[i]=='W')
			{
				counter++;
			}
			
		}
		min = Math.min(counter, min);
		
		for(int j=k;j<s.length;j++)
		{
			if(s[k]=='w')
			{
				
				counter++;
			} 
			if(s[left]=='w')
			{
				
				counter--;
			}left++;
			
			min = Math.min(counter, min);
		}
		
	System.out.print(min);
		
	}
			 

}
