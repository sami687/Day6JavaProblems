package bridgelabz.com;
import java.util.Scanner;

public class perfectNumber {
	public static void main(String[] args) {
		int i,  Sum = 0 ;
		Scanner perfect = new Scanner(System.in);
		System.out.println("\n Please Enter any Number: ");
		int number = perfect.nextInt();
		perfect.close();

		for(i = 1 ; i < number ; i++) {
			if(number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == number) {
			System.out.format("is a Perfect Number", number);
		}
		else {
			System.out.format("is NOT a Perfect Number", number);
		}
	}
}



