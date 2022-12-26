package assesment;

public class FormPalindrome {

	public void examplePositiveData()
	{
		
		String s= "aab";
		
		examplePositiveData(s);
		
	}

	private void examplePositiveData(String s) {
		// TODO Auto-generated method stub
		
		int count[] = new int[s.length()];
        Arrays.fill(count, 0);

        for (int i = 0; i < str.length(); i++)
            count[(int)(str.charAt(i))]++;
 
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if ((count[i] & 1) == 1)
                odd++;
 
            if (odd > 1)
                return false;
        }
 
    }
		
	}
	
	
}
