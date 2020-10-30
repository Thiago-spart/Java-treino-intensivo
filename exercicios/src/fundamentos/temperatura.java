package fundamentos;

public class temperatura {
	//you also can call main to write the code below more faster
	public static void main(String[] args) {
		//(*F - 32) x 5/9 = c
		final double LIKE = 32;
		final double CONVERSION = 5 / 9;
		double f = 93;
		double c = CONVERSION * (f - LIKE);
		
		System.out.println("The conversion of the "+ f +" f is = "+ c +" c");
	}
}
