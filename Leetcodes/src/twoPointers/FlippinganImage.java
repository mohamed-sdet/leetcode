package twoPointers;

import java.util.Arrays;

import org.junit.Test;

public class FlippinganImage {
	/*
	 * 832. Flipping an Image
	 */
	
	/*Read the input array then 
	 * using for loop read sub array 
	 * using wile loop swap it 
	 *  use another array then swap 0s to 1 
	 */
	
	
	@Test
	public void examplePositive()
	{
		
		int [] [] image = {{1,1,0},{1,0,1},{0,0,0}};
		

		FlippinganImage(image);
		
	}

	private void FlippinganImage(int[][] image) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<image.length;i++)
		{
			 int[] imageSub = image[i];
			 
			 int start= 0; 
			 int end = imageSub.length-1;
			 
			 while(start<end)
			 {
				 int temp = imageSub[end];
				 imageSub[end--] = imageSub[start];
				 imageSub[start++]=temp;
					 
			 }
			 
			 
			 
			 System.out.print(Arrays.toString(imageSub));
			
		}
		
		for(int j=0;j<image.length;j++)
		{
			int[] imageSub = image[j];
			
			for(int k=0;k<imageSub.length;k++)
			{
				if(imageSub[k]==0)
				{
					imageSub[k]=1;
					
				}else
				{
					imageSub[k]=0;
					
				}
				
			}
			 System.out.print(Arrays.toString(imageSub));
		}
		
	}
	

}
