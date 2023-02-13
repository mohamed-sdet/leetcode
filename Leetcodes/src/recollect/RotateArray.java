package recollect;

import java.util.Arrays;

import org.junit.Test;

public class RotateArray {

	@Test
	public void exampleData()
	{
	int[] nums  = {1,2,3,4,5,6,7};
	int k =3;
	
	rotateArrayWithKValue(nums,k);
	}
	
	/*Initialize temp variable and rev variable
	 * Initialize for loop untill k and assign last val of arr to rev
	 * Initialize inner for loop until nums len swap rev value to first val 
	 * return  nums
	 */

	
	private void rotateArrayWithKValue(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int temp=0;int rev =0;
		for(int i=0;i<k;i++)
		{
			rev= nums[nums.length-1];
			for(int j=0;j<nums.length;j++)
			{
				temp =nums[j];
				nums[j]=rev;
				rev=temp;
				System.out.println(Arrays.toString(nums));
			}
		}
		//System.out.print(Arrays.toString(nums));
		
	}
	
	
}
