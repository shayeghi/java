
public class BasicConcept {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (circumference(i) <= 100) {
				System.out.println(circumference(i));
				// System.out.println(i);
				double infinity = Double.MAX_VALUE * -2;
				System.out.println(infinity);
			}
		}
	}

	private static double circumference(int i) {
		return 3.14 * 2 * i;
	}

}
