package randomProblem1;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		    int nums[] = {45,65,23,58,-56,86,90,99,-97,3658};
		
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for(int i=0;i<nums.length;i++)
			{
				if(min>nums[i])
					min = nums[i];
				
				if(max<nums[i]);
				max = nums[i];
			}
			
			System.out.println(min);
			
			System.out.println(max);
			
			
	}

}
