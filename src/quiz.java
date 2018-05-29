import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		int counter = 1;
		double sum = 0;
		Scanner input = new Scanner(System.in);
		while (counter<=10) {
			System.out.print("grade student number "+counter+":");
		    sum = input.nextDouble()+sum;
		    counter++;
			
		}
		System.out.println();
		System.out.println("the class average is equal to "+sum/10);
	}

}
