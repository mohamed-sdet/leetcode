package recurssion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(findFactorial(n));
		//System.out.println(bruteForce(n));
	}

	public static  int findFactorial(int n) {
		// TODO Auto-generated method stub
		
		if(n==1)
		{
			return 1;
		}
		System.out.print(n);
		System.out.print(n-1);
		
		 n = n * findFactorial(n-1);
		return n;
	}
	
	public static int bruteForce(int n)
	{
		int fac=1;
		for(int i=n;i>0;i--)
		{	
			fac =fac*i;
		}
		return fac;
	}

	

}
