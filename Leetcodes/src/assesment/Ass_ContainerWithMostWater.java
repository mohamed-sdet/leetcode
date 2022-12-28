package assesment;

import org.junit.Test;

public class Ass_ContainerWithMostWater {
	
	@Test
	public void examplePostiveData()
	{
		int height[]  = {1,8,6,2,5,4,8,3,7};
		
		containerWithMostWater(height);
		
	}

	private void containerWithMostWater(int[] height) {
		// TODO Auto-generated method stub
		
        //1,8,6,2,5,4,8,3,7
        int maxWater=0;
        int out=0;
      for(int i=0;i<height.length-1;i++){
        for (int j=1;j<height.length;j++)
        {
            int dif  = (j-i);
            if(height[j]>height[i])
            { 
                maxWater = dif * height[i];
            }else 
            {
                 maxWater = dif * height[j];
            }
            out= Math.max(out,maxWater);
        }
      
    }
		
	}

}
