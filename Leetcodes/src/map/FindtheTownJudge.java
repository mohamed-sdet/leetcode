package map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.HashMap;

import org.junit.Test;

public class FindtheTownJudge {
	
	
	//https://leetcode.com/problems/find-the-town-judge/
	
	/*
	 *Initialize Map  with Integer and Integer 
	 * Iterate the given 2d array input 
	 * add first index to the map then decrement by -1
	 * add second index to map then increment it 
	 * Now loop through the map then find the values 
	 * if any of the values has the given n-1 then find its key and return 
	 */
	
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

	//Time = O[N], Space = O[1]
	private int findtheTownJudge(int n, int[][] trust) {
		// TODO Auto-generated method stub
		
		int output=0;
		HashMap<Integer,Integer> map = new HashMap<>();
        
		//O[n]
        for(int i=0;i<trust.length;i++)
        {
            map.put(trust[i][0],map.getOrDefault(trust[i][0],0)-1);
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
        }
        //O[n]
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
