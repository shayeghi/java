import java.util.Scanner;

public class AdditionPrompt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("give me first number :");
		int a = input.nextInt();
		System.out.println("give me secound number :");
	    int b = input.nextInt();
		System.out.printf("%d+%d=%d ",a,b,a+b);

	}

}
