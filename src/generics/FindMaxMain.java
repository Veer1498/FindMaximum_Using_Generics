package generics;

public class FindMaxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaximum findMax = new FindMaximum();
		findMax.welcome();
		System.out.println("\nINTEGERS");
		findMax.getMax(10, 5, 35);
		System.out.println("\nFLOAT");
		findMax.getMax(1.2f, 2.2f, 1.1f);
		System.out.println("\nSTRINGS");
		findMax.getMax("apple", "banana", "mango");
	}

}
