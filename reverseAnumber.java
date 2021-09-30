package bridgelabz.com;
import java.util.Scanner;

public class reverseAnumber {
	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		number = s.nextInt();
		s.close();
		int reverse = 0;
		
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
		}  
		



