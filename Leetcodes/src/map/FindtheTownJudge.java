package map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.HashMap;

import org.junit.Test;

public class FindtheTownJudge {
	
	
	//https://leetcode.com/problems/find-the-town-judge/
	@Test
	public void exampleData()
	{
		
		int n = 3; 
		int[][] trust = {{1,3},{2,3}};
		findtheTownJudge(n,trust);
	}
	
	@Test
	public void exampleDatapositive()
	{
		
		int n = 3; 
		int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		findtheTownJudge(n,trust);
	}

	private int findtheTownJudge(int n, int[][] trust) {
		// TODO Auto-generated method stub
		
		int output=0;
		HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<trust.length;i++)
        {
            map.put(trust[i][0],map.getOrDefault(trust[i][0],0)-1);
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
        }
        
        for(int j=1;j<=n;j++)
        {
        	
        	int temp = map.getOrDefault(j,0);
        	if(map.getOrDefault(j,0)== n-1)
        	{
        		System.out.print(j);
        		return j;
        		
        	}
        }
        
        return -1;
        
        
	}

}
