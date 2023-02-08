package recollect;

import java.util.Arrays;

import org.junit.Test;

public class ExpandFromCenter {
	
	@Test
	public void exampleData()
	{
		String s = "loveleetcode";
		char c = 'e';
		
		//shortestToChar(s,c);
		
		shortestchar(s,c);
	
	}

	private void shortestToChar(String s, char c) {
		// TODO Auto-generated method stub
		int[] result = new int[s.length()];
		char[] chArr = s.toCharArray();
		
		int left = 0, right = 0;
		int len = chArr.length;
		for(int i = 0; i < len; i++ ){
			left = i - 1;
			right = i + 1;
		while(left >= 0 || right < len){
			
			if(chArr[i] == c){
				result[i] = 0;
				break;
			}
			if(left >= 0){
				if(chArr[left] == c){
					result[i] = Math.abs(i - left);
					break;
				}else{
					left--;
				}
			}
			if(right < len){
				if(chArr[right] == c){
					result[i] = Math.abs(right - i);
					break;
				}else{
					right++;
				}
			}

		}
		
		}
		System.out.print(Arrays.toString(result));
	}
	
	private void shortestchar(String s, char c)
	{
		  int[] arr = new int[s.length()];
	        Arrays.fill(arr, Integer.MAX_VALUE);
	        int left = 0, right = 0;
	        while (right < s.length()) {
	            if (s.charAt(right) == c) {
	                while (left <= right) {
	                    arr[left] = right - left;
	                    left++;
	                }
	            }
	            right++;
	        }
	        left = right = s.length() - 1;
	        while (right >= 0) {
	            if (s.charAt(right) == c) {
	                while (left >= right) {
	                    arr[left] = Math.min(arr[left], left - right);
	                    left--;
	                }
	            }
	            right--;
	        }
	        System.out.print(Arrays.toString(arr));
	}

}
