package arrays;
import java.util.Arrays;

import org.junit.Test;

public class MaxofTwoProduct {
	
	
	
	
	 /* Traverse to the given input 
	  * find out two maximum number 
    	then product those two input and return the output
	  */
	
	@Test
	public void examplePositive()
	{
	  
		int nums[] = {2,3,4,5,2};
		
		//MaxProduct(nums);
		
	}
	@Test
	public void exampleEdge()
	{
	  
		int nums[] = {1,5,4,5};
		//int nums[] = {5,4,5,2};
		//int nums[] = {3,4,5,2};
		
		productMax1(nums);
		
	}
	
	
	
	public void MaxProduct(int nums[])

	{
		
		int tempMax1 = 0;
        int tempMax2 = 0;
        int temp;
        
        for(int i=0;i<nums.length-1;i++)
        {
                if(nums[i] >nums[i+1] && nums[i] != nums[i+1] )
                {
                    tempMax1 =nums[i];

                } else if(nums[i]>=tempMax2 ) 
                {
               	
                 tempMax2= nums[i];	
                }
        }
        tempMax1 = tempMax1-1; 
        tempMax2=tempMax2-1;
        
		temp=tempMax1*tempMax2;
        
        System.out.println(tempMax1);
        System.out.println(tempMax2);
        System.out.println(temp);	
		
	}
	public void productMax(int [] nums)
	{
		int max1 =0;
		int max2 =0;
		int temp;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length-1;j++)
			{
				if(nums[i]>nums[j] && nums[i] >max1)
				{
					max1=nums[i];
					
				}else 
				{	
					max2=nums[i];
				}
				
			}
			
			
		}
		max1 = max1-1;
		max2=max2-1;
		temp=max1*max2;
		 System.out.println(max1);
	      System.out.println(max2);
	      System.out.println(temp);	
		
	}
    
	public void productMax1(int [] nums)
	{
		
		int temp;
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.println("i"+ i);
			for(int j=1;j<nums.length;j++)
			{
				System.out.println("jokay "+ j);
				if(nums[i]<=nums[j] )
				{
					temp = nums[i];
					nums[i]= nums[j];
					nums[j]= temp;
					
				}
				
			}
			
			
			
		}
		temp =((nums[0])-1) * ((nums[1])-1);
		System.out.print(Arrays.toString(nums));		
		System.out.println(temp);	
			
		
	}
	
	}
	
	
	
	


