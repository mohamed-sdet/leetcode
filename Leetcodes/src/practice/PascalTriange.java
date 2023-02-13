package practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PascalTriange {

	@Test
	public void exampleData() 
	{
		
		int i =3;
		System.out.print(pascalTriange(i));
	}
	public List pascalTriange(int rowIndex)
	{
		
		List<Integer> list1 = new ArrayList(); 

        for(int i=0;i<=rowIndex;i++){

             list1.add(1);
        for(int j=i-1;j>0;j--)
        {
            list1.set(j,list1.get(j)+list1.get(j-1));
        }
 
        }
        return list1;
	}
}
