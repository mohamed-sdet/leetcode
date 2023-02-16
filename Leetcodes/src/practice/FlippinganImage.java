package practice;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FlippinganImage {
	//https://leetcode.com/problems/flipping-an-image/
	
	@Test
	public void exampleData()
	{
		
		int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
		
		flipingImage(image);
		
	}

	private void flipingImage(int[][] image) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.deepToString(image));
		
		for(int i = 0;i<image.length;i++)
		{
			swap(image[i]);
		}
		System.out.println(Arrays.deepToString(image));
		
	}
	
	public void swap(int[] val)
	{
		int left =0;
		int right =val.length-1;
		
		while(left<=right)
		{
			int temp = val[right];
			val[right--] = val[left] == 0 ?  1:0;
			val[left++] = temp==0 ? 1:0;
		}
		
	}

}
