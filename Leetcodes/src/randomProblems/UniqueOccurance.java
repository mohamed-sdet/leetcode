package randomProblems;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class UniqueOccurance {
	
	
	@Test
	public void exampleData()
	{
		int[] num = {1,2,2,3,3,3};
		
		sumNumber(num);
	}

	private void sumNumber(int[] num) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		
		for(int i=0;i<num.length;i++)
		{
			map.put(num[i], map.getOrDefault(num[i], 0)+1);
		}
		map.values();
		
		HashSet<Integer> set = new HashSet<>(map.values());
		
		if(map.values().size() == set.size())
		{
			System.out.print("True");
		}else
		{
			System.out.print("False");
		}
	}

}
