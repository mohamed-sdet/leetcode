package randomProblems;

public class SplitString {
	
	public void exampleData()
	{
		String s = "Automation";
		
		rev(s);
		
	}
	
	
	
	
	private void rev(String s) {
		// TODO Auto-generated method stub
		
		String firstName = s.substring(s.length()/2);
		String s2 = s.substring(s.length()/2+1);
		
		
		
		
	}




	public String  reverseStrings(String t)
	{
		char [] ch = t.toCharArray();
		
		int left =0;
		int right = ch.length-1;
		while(left<right)
		{
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}
		return String.copyValueOf(ch); 
	}

}
