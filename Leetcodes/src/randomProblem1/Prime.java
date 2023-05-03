package randomProblem1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num = 13;
		 boolean flag = false;
		 for(int i=2;i<num;i++)
		 {
			 if(num % i == 0)
			 {
				 System.out.print("This is not prime Number");
				 flag = false;
				 break; 
			 }
		 }
		 
		 if(flag)
		 {
			 System.out.print(flag);
		 }
	}

}
