package map;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.Test;

public class BuddyStrings {

	@Test
	public void exampleData()
	{
		String s = "ab", goal = "ba";
		buddyStrings(s,goal);

	}
	
	@Test
	public void exampleEdgeData()
	{
		String s = "ab", goal = "ab";
		buddyStrings(s,goal);

	}


	private void buddyStrings(String s, String goal) {
		// TODO Auto-generated method stub
		boolean output = false;
		HashSet<Character> goalSet = new LinkedHashSet<>();
		HashSet<Character> sSet = new LinkedHashSet<>();
		
		for(int i=0;i<goal.length();i++)
		{
			goalSet.add(goal.charAt(i));
			
		}
		
		for(int j=s.length()-1;j>=0;j--)
		{
			sSet.add(s.charAt(j));
		}
		if(sSet.equals(goalSet))
		{
			output =  true;
			
		}
		
		System.out.print(output);
		
	}
	
}
