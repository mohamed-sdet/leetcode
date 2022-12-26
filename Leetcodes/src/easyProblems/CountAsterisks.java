package easyProblems;

import org.junit.Test;

public class CountAsterisks {
	
	@Test
	public void exampleData()
	{
		
	     String s = "l|*e*et|c**o|*de|";
	     
	     countAsterisks(s);
	}
	
	@Test
	public void exampleData1()
	{
		
	     String s = "yo|uar|e**|b|e***au|tifu|l";
	     
	     countAsterisks(s);
	}

	private void countAsterisks(String s) {
		// TODO Auto-generated method stub
		boolean insidePipe = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                insidePipe = !insidePipe;
            }
            if(!insidePipe && s.charAt(i) == '*'){
                count++;
            }
        }
        System.out.print(count);
	}

}
