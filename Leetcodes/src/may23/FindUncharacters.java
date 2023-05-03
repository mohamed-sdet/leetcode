package may23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindUncharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Mohammed";
		
		char [] ch = s.toCharArray();
		
		 HashSet<Character> set = new HashSet<>();
		   
		   List<Character> list = new ArrayList<>();
		
		for(int i=0;i<ch.length;i++)
		{
			
		   if(!set.add(ch[i]))
		   {
			   
		   }else
		   {
			   list.add(ch[i]);
		   } 
		  
		}
		
		 System.out.print(list);

	}
}
