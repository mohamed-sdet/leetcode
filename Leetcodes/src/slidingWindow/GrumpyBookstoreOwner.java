package slidingWindow;

public class GrumpyBookstoreOwner {

	//https://leetcode.com/problems/grumpy-bookstore-owner/
	
	//Question not understand 
	
	/*Pesudo code 
	 * Iterate the given element 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	public void  examplePositiveData()
	{
		int customers [] = {1,0,1,2,1,1,7,5};
		
		int grumpy[]  = {0,1,0,1,0,1,0,1};
		
		int minutes = 3;
		grumpyBookstoreOwner(customers,grumpy,minutes);
		
		
		
	}

	private void grumpyBookstoreOwner(int[] customers, int[] grumpy, int minutes) {
		// TODO Auto-generated method stub
		

        int sum=0;
        int temp=0;
        
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]!=1) sum = sum + customers[i];

        }
        
        for(int j=0;j<minutes;j++)
        {
            if(grumpy[j]==1) sum = sum + customers[j];
            
        }
        
        
        temp =sum;
        for(int k=minutes;k<customers.length;k++)
        {
            
          if(grumpy[k]==1)
          {
            temp  = sum+ customers[k];
          }
          if(grumpy[k-minutes]==0) temp = sum-customers[k-minutes];
            System.out.println(temp);  
            sum = Math.max(temp,sum);
            
        }
		
	}
	
}
