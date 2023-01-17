package recollect;

import java.util.Arrays;

import org.junit.Test;

public class ArrayInterSection {
	
	@Test
	public void exampleData()
	{
		int[] a = {1,2,3,4,5};
		
		int [] b= {5,6,7,8,9};
		
		
		 arrayIntersection(a,b);
		 
		 
	}

	private void arrayIntersection(int[] a, int[] b) {

		
		// TODO Auto-generated method stub
		
		int [] output = new int[a.length+b.length];
		
		int left=0;
		int right =0;
		int counter =0;
		
		while(a[left]<a.length || b[right]<b.length)
		{
			if(left==a.length&&right<b.length)
			{
				output[counter++] = b[right++];
			}
			
			if(a[left]<b[right])
			{
				output[counter++]= a[left];
				left++;
				
			}else if(b[right]<a[left])
			{
				output[counter++] =b[right];
				right++;
			}
				
		}
		
		System.out.println(Arrays.toString(output));
		throw new RuntimeException("mohamed");
	}
}
