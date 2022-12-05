package assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class DuplicateProduct {
	
	@Test
	public void examplePostiveData()
	{
		List<String> name = new ArrayList(Arrays.asList(new String[] {"ball","bat","glove","glove","glove"}));
		
		Integer[] prices = {2,3,1,2,1};
		List<Integer> price = Arrays.asList(prices);
		List<Integer> weigth = new ArrayList(Arrays.asList(new Integer[] {2,5,1,1,1}));
		
		duplicateProduct(name,price,weigth);
		
	}
	@Test
	public void examplePostiveData2()
	{
		List<String> name = new ArrayList(Arrays.asList(new String[] {"ball","bat","glove","glove","glove"}));
		
		Integer[] prices = {2,2,2,2,2};
		List<Integer> price = Arrays.asList(prices);
		List<Integer> weigth = new ArrayList(Arrays.asList(new Integer[] {2,5,1,1,1}));
		
		duplicateProduct(name,price,weigth);
		
	}

	private void duplicateProduct(List<String> name, List<Integer> price, List<Integer> weigth) {
		// TODO Auto-generated method stub
		
		int output =0;
		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<name.size();i++)
		{
			if(!set.add(name.get(i)+"-"+price.get(i)+"-"+weigth.get(i)))
			{
				
				output++;
			}
			
		}
		
		System.out.print(output);
		
	}
	

}
