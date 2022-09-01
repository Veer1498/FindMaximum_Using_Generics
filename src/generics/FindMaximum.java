package generics;
/**
 * Find Max Using Generics
 * @author Veer.Singa
 *
 */
public class FindMaximum {
	//Welcome Function
	public void welcome() {
		System.out.println("Welcome to Find maximum Using Generics Program");
		System.out.println("==============================================");
	}
	
	/*
	 * getMax Function
	 * This a Generic Method Passing 3Parameters of type T
	 * Comparing 3 parameters and Finding Max Value
	 * Printing Max Value and Returning it for Further Use.
	 */
	public <T extends Comparable<T>> T getMax(T x,T y,T z) {
		T max = x;
		if(y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			max = y;
		}
		else if(z.compareTo(x) > 0 && z.compareTo(y) > 0) {
			max = z;
		}
		System.out.println("Values : "+x+" "+y+" "+z);
		System.out.println("The Max of 3 Values : "+max);
		return max;
		
	}
	
	
}
