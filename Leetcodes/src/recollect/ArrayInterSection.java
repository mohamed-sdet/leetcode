package recollect;

import java.util.Arrays;

import org.junit.Test;

public class ArrayInterSection {
	
	@Test
	public void exampleData()
	{
		int[] a = {1,2,3,4,5};
		
		int [] b= {5,6,7,8,9};
		
		
		arrayMerge(a,b);
		 
		 
	}
	
	public void arrayMerge(int[] a, int[] b)
	{
		int left =0;
		int right =0;
		int [] temp = new int[a.length+b.length];
		int counter =0;
		
		while(left < a.length || right < b.length)
		{
			if(left==a.length)
			{
				temp[counter++] = b[right++];
			}else if(right==b.length)
			{
				temp[counter++] = a[left++];
			}else if(a[left] <= b[right])
			{
				temp[counter++] = a[left];
				left++;
			}else 
			{
				temp[counter++] = b[right];
				right++;
			}
	
		}
		System.out.print(Arrays.toString(temp));
				
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
		
	}


	public void ArrayIntersection(int[] a, int[] b)
	{
		int left=0;
		int right=0;
		
		while(left<a.length && right<b.length)
		{
			if(a[left]==b[right])
			{
				System.out.print(left +" "+ right);
			}else if(a[left]<b[right])
			{
				left++;
			}else 
			{
				right++;
			}
		}

		
	}
}
