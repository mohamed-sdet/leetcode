package string;

import org.junit.Test;

public class StringOccurance {
	
	@Test
	public void findtheOccurance()
	{
		
		String s  = "opentext";
		char occurance = 't';
		
	     StringBuilder sb = new StringBuilder();
	     int counter =0;
	     
	     for(int i=0;i<s.length();i++)
	     {
	    	 if(s.charAt(i) == occurance)
	    	 {
	    		 counter++;
	    		 sb.append(counter);
	    	 }else 
	    	 {
	    		 sb.append(s.charAt(i));
	    	 }
	    	 
	     }
	     
	     System.out.print(sb);
	}

}
