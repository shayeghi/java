import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		double interest;
		double principal;
		Scanner input  = new Scanner(System.in);
		System.out.println("dollar price now in rials?");
		
		principal = input.nextDouble();
		System.out.println("iranian interest rate bank now?");
		interest = input.nextDouble();
		System.out.println("--------------------------");
		System.out.print("|Year| |Amount on futur  |");
		for (int i = 2012; i <=2037 ; i++) {
			principal = principal *(1+interest);
			System.out.println();
			System.out.println("|------------------------|");
			System.out.printf("|Year |%3d |  %-,10.2f ",i,principal);
			System.out.print("|");
		
		}
		System.out.println();
		System.out.println("--------------------------");

	}

}
