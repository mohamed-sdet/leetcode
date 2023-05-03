package may23;

import java.util.Arrays;

public class Revese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s = "I love Programming ";

		String[] ch = s.split(" ");
		
		twoPointer(ch);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}

	}
	
	public static void twoPointer(String[] s )
	{
		int left =0;
		int right = s.length-1;
		
		while(left<right)
		{
			String temp = s[right];
			s[right--] = s[left];
			s[left++] = temp;
		}
		
		System.out.print(Arrays.toString(s));
	}

}
