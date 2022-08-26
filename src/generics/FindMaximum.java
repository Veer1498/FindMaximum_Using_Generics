package generics;

public class FindMaximum {
	public void welcome() {
		System.out.println("Welcome to Find maximum Using Generics Program");
		System.out.println("==============================================");
	}
	
	public Integer getMaxInteger(Integer x,Integer y,Integer z) {
		Integer max = x;
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
	
	public Float getMaxFloat(Float x, Float y, Float z) {		
		Float max = x;
		if(y.compareTo(x)>0 && y.compareTo(z)>0) {
			max = y;
		}
		else if(z.compareTo(y)>0 && z.compareTo(x)>0) {
			max = z;
		}
		System.out.println("Values : "+x+" "+y+" "+z);
		System.out.println("The Max is "+max);
		return max;
	}
}
