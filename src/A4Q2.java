import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class A4Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		double Number;
		
		//Ask user to enter a number, until that number is +
		do{
			
			//Asks user to enter a number for Number
			System.out.println("Please inter a number:");
			Number=userInput.nextDouble();
			
			//Tests whether the user entered a positive number
			if(Number < 0){
				System.out.println("I can't take the square root of this number");
		}
		
		
		}while(Number<0);

		System.out.println("The result is :" +Math.sqrt(Number));
		
		 userInput.close();
	}
}
	
		
	

		
		
