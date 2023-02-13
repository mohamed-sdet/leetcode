package practice;

import java.util.Arrays;

import org.junit.Test;

public class RotateImage {
	
	@Test
	public void examplePostiveData()
	{
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		rotateBruteforce(matrix);
	}

	private void rotateBruteforce(int[][] matrix) {
		// TODO Auto-generated method stub
		int [][] output =  new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            int [] row = matrix[i];
         for(int j=0;j<matrix.length;j++)   
         {
            output[j][matrix.length-i-1] =row[j];
         }
           
        }
        
        for(int i=0;i<output.length;i++)
        {
            int [] each = output[i];
            for(int j=0;j<each.length;j++)
            {
                matrix[i][j]= output[i][j];
            }
        }
        
	}

}
