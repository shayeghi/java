import java.util.Scanner;

public class classAverage {
	public static void main(String[] args) {
		double sum = 0 ;
		int counter = 0;
		int quit = 0 ;
		double average;
		
		while (quit != -1) {
			Scanner input  = new Scanner(System.in) ;
			System.out.println("give me "+ ++counter +" student grade or quit for -1 :");
			double grade = input.nextDouble() ;
			if (grade==-1) {
				quit =-1;
			}
			else {
			sum = sum + grade;
			}	
		}
		
		if (counter==1) {
			System.out.println("no grades were entered");
			
		}
		else {
		
		System.out.println("total of "+ --counter +" grades entered is "+sum);
		average = sum /counter;
		System.out.printf("class average is %.2f ",average);
		}
	}

}
