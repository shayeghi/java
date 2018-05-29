import java.util.Scanner;


public class comparation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("five me first number: ");
		int first_number = input.nextInt();
		System.out.println("give me second number: ");
		int second_number=input.nextInt();
		compare(first_number,second_number);
		
	}

	private static void compare(int first_number, int second_number) {
		if (first_number>second_number) {
			System.out.printf("%d is greater than %d",first_number,second_number);
			
		}
		if (first_number<second_number) {
			System.out.printf("%d is greater than %d",second_number,first_number);
			
		}
		if (first_number==second_number) {
			System.out.printf("%d is equal to %d",second_number,first_number);
			
		}
	
		
	}

}
