import java.util.Scanner;

public class Analyse {

	public static void main(String[] args) {	
		int fail = 0 ;
		int pass = 0 ;
		for (int student = 1; student <= 10; student++) {
			System.out.println("enter 1=pass or 2=fail student of "+student);
			Scanner input = new Scanner(System.in);
			if (input.nextInt()==1) {
				pass++;
				
			} else {
				fail++;
			}
				
		}
		System.out.println("pased= " +pass);
		System.out.println("fail= "   +fail);
		if (pass>=8) {
			System.out.println("Bonus for instructor!");
		}

	}

}
