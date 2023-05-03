package randomProblem1;

public class Fibonoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int firstNum =1;
		  int secondNum =0;
		  int sum =0;
		  
		  for(int i=0;i<10;i++)
		  {
			  sum = firstNum +secondNum;
			  
			  firstNum = secondNum;
			  secondNum= sum;
			  System.out.println(sum);
			
		  }
		  
		  
	}

}
