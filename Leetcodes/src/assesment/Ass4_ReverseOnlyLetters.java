package assesment;

import org.junit.Test;

public class Ass4_ReverseOnlyLetters {

	
	@Test
	public void examplePositiveData()
	{
		
		String s = "ab-cd";
		
		bruteforcerevese(s);
		
	}

	private void bruteforcerevese(String s) {
		// TODO Auto-generated method stub
		char [] ch = s.toCharArray();
        int counter=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isLetter(ch[i]))
            {
            	ch[counter++]= ch[i];
            }else 
            {
            	counter++;
            }
            
        }
        System.out.print(String.valueOf(ch));
	}
}
