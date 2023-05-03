package randomProblem1;

import java.util.Arrays;

public class Mutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a ={4,0,1,-2,3 };
		mutateArray(a);
		
	}
	
	public static void mutateArray(int[] a) {
	    int[] b = new int[a.length];
	    for (int i = 0; i < a.length; i++) {
	        int prev = i > 0 ? a[i - 1] : 0;
	        int next = i < a.length - 1 ? a[i + 1] : 0;
	        b[i] = prev + a[i] + next;
	    }
	    System.out.print(Arrays.toString(b));
	}

}
