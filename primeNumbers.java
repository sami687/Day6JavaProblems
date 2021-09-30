package bridgelabz.com;
import java.util.Scanner;

public class primeNumbers {
	public static void main(String[] args) {
		int number;
		Scanner prime = new Scanner(System.in);
		System.out.println("Enter a number :");
		number = prime.nextInt();
		prime.close();
		int count = 0;
		if(number == 0 || number == 1) {
			System.out.println(number + "is not prime ");
		}else {

			for (int  i = 2; i < number -1; i++) {

				if(number % i == 0) {
					System.out.println(number + "is not prime ");
					count = count+1 ;
				}
			}
		}
		if (count == 0) {
			System.out.println(number + " is a prime number");
		}
	}
}
