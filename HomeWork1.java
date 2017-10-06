import java.util.*;

// Calculation of the linear equation  "ax + b = 0" and finding even numbers
class HomeWork{
	public static void main(String[] args){
		
		// First part of Exercise (Linear equation)
		Scanner scanner = new Scanner(System.in);
		
		float x;
		System.out.println("Computing:  ax + b = 0");
		
		System.out.println("Input 'a' = ");
		String aStr = scanner.nextLine();
		float aNum = Float.parseFloat(aStr);
		
		System.out.println("Input 'b' = ");
		String bStr = scanner.nextLine();
		float bNum = Float.parseFloat(bStr);
		
		x = -bNum/aNum; 
		
		System.out.println("x = " + x);
		
		// Second part of exercise (Even number)
		
		System.out.print("Input the integer number: ");
		String evenNumStr = scanner.nextLine();
		int evenNum = Integer.parseInt(evenNumStr);
		
		if(evenNum % 2 == 0)
			System.out.print("Your number: " + evenNum+ " is even!");
		else
			System.out.print("Your number: " + evenNum + " is NOT even !!!");		
	}	
}
 
 
 
 