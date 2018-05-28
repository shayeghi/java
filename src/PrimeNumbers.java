
public class PrimeNumbers {

	public static void main(String[] args) {
		for (int number = 0; number < 50; number++) {
			if(isPrime(number))
				System.out.println(number);
		}

	}

	private static boolean isPrime(int number) {
		if (number<2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number%i==0)
				return false;
			
		}
		return true;
	}

}
