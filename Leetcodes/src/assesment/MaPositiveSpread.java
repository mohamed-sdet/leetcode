package assesment;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MaPositiveSpread {
	
	@Test
	public void postiveData()
	{
		int [] px = {7,1,2,5};
		maxPositveSpread(px);
		
	}

	private void maxPositveSpread(int[] px) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Integer> list = new ArrayList<>();
		
		for(int in : px)
		{
			list.add(in);
		}
		int temp = list.get(0),dif=-1,i=1;
		
		while(i<list.size())
		{
			if(list.get(i)>temp)
			{
				dif = Math.max(dif, list.get(i)-temp);
			}else
			{
				temp=list.get(i);
			}
			i++;
			
		}
		System.out.print(dif);
		
	}

}
