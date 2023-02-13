package practice;

public class PartitionArrayAccordingtoGivenPivot {
	
	public void exampleData()
	{
		int num[] = {9,12,5,10,14,3,10};
		int pivot =0;
		exampleDatas(num,pivot);
	}

	private int[]  exampleDatas(int[] nums, int pivot) {
		// TODO Auto-generated method stub
		int [] res = new int[nums.length];
		int left=0, right=nums.length-1;
		for(int i=0; i<nums.length; ++i){
			if(nums[i]<pivot)
				res[left++]=nums[i];
			if(nums[nums.length-i-1]>pivot){
				res[right--]=nums[nums.length-i-1];
			}
		}
		while(left <= right){
			res[left++]=pivot;
		}
		return res;
	}

}
