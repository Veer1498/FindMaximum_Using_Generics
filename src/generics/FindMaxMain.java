package generics;

public class FindMaxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaximum findMax = new FindMaximum();
		findMax.welcome();
		System.out.println("\nINTEGERS");
		findMax.getMaxInteger(10, 5, 35);
		System.out.println("\nFLOAT");
		findMax.getMaxFloat(1.2f, 2.2f, 1.1f);
	}

}
