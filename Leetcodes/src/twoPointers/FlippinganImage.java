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
		

		//FlippinganImage(image);
		
		flipingImage(image);
		
	}

	private void FlippinganImage(int[][] image) {
		// TODO Auto-generated method stub
		

		for(int i=0;i<image.length;i++)
		{   
			 int[] imageSub = image[i];
			 
			 int start= 0; 
			 int end = imageSub.length-1;

			 while(start<=end)
			 {
				 int temp = imageSub[end];
				 imageSub[end--] = 	(imageSub[start] ==0)? 1:0;
				 imageSub[start++] =(temp==0)? 1:0;
					 
			 }
			 
			 System.out.print(Arrays.toString(imageSub));
			
		}
		
		
		
	}
	

	public void flipingImage(int[][] image)
	{
		
		int [][] out = new int[image.length][];

	     for(int i=0;i<image.length;i++)
	     {
	         int[] temp = image[i];
	         swap(temp);
	         System.out.print(Arrays.toString(temp));   
	     }
	     
	     System.out.print(Arrays.toString(image));
	     
	    
	}
	public int[] swap(int [] temp)
    {

       int left=0;
       int right = temp.length-1;
        while(left<=right)
        {
           int temp1 = temp[left];
           temp[left++]= (temp[right]==0) ?1:0 ;
           temp[right--] = (temp1==1)?0:1;   
        }
        return temp;
    } 

}
