package string;

import org.junit.Test;

public class RemoveDuplicate {
	
	

	public void removeDuplicate()
	{
		String s = "Programming";
		
		StringBuffer sb = new StringBuffer(s);
		
		sb.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
	}
	
	@Test
	public void removeDuplicateforloop()
	{
		String s = "Programming";
		StringBuilder t = new StringBuilder();
		
		char [] sh = s.toCharArray();
		for(int i=0;i<sh.length;i++)
		{
			boolean repeated = false;
			for(int j=i+1;j<sh.length;j++)
			{
				if(sh[i] == sh[j])
				{
					repeated = true;
					break;
				}
			}
			
			if(!repeated)
			{
				t.append(sh[i])  ;
			}
		}
		
		System.out.print(t);
	}


}
