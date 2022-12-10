package assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class FrequencySort {
	
	
	private static final int ArrayList = 0;


	/*Initialize HashMap and put map by Iterating the Value and occurrence 
	 *Get the values of the occurrence and sort using collection sort 
	 *Iterate the map values using the list sorted values 
	 *Then Iterate the values using while loop and store the key on output arrays  
	 * Return out put arrays 
	 */
	
	@Test
	public void examplePostiveData()
	{
		int[] item = {4,5,6,5,4,3};
		
		//frequencySort(item);
		frequencySortoptimize(item);
		
	}

	private void frequencySort(int[] item) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> map = new TreeMap<>();
		int[] output= new int[item.length];
		for(int i=0;i<item.length;i++)
		{
			map.put(item[i], map.getOrDefault(item[i], 0)+1);
		}
		System.out.println(map);
		int count =0;
		int last = item.length-1;
	
		List<Integer> lis = new ArrayList();
		
		for(int num : map.values())
		{
			lis.add(num);
		}
		Collections.sort(lis);
		
		
		for(int i=0;i<lis.size();i++)
		{
		for(Entry<Integer, Integer> out : map.entrySet())
		{
			//System.out.println("key " + out.getKey() +"value "+out.getValue() );
			
						
			if(lis.get(i)==out.getValue())
			{
				int occ = out.getValue();
				while(occ>0)
				{
					output[count++]= out.getKey();
					occ--;
				}
				map.put(out.getKey(),0);
			}
		}
		}
		
		System.out.print(Arrays.toString(output));
		
	}
	

	private void frequencySortoptimize(int [] item)
	{
		HashMap <Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<item.length;i++)
		{
			map.put(item[i], map.getOrDefault(item[i],0)+1);
		}
		
		List<Integer> list =new ArrayList();
		
		for(int i : map.values())
		{
			list.add(i);
		}
		Collections.sort(list);
		
		int[] output= new int [item.length];
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			for(Entry<Integer,Integer> ent: map.entrySet())
			{
				
				if(list.get(i)==ent.getValue())
				{
					int fre = ent.getValue();
					while(fre>0)
					{
						output[count++]= ent.getKey();
						
						fre--;
						
					}
					map.put(ent.getKey(), 0);
					
				}
				
			}
			
			
		}
		System.out.print(Arrays.toString(output));
	}
	
}
