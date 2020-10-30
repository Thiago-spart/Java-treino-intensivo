package fundamentos;

public class AreaCircuferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		//final is like const in JS
		//the variavel's name cannot be in lowercase, just uppercase this is a good pratice.
		final double PI = 3.14159;
		double area = PI * raio * raio;
		
		//sysout when you're want to write a print code more fast
		System.out.println("Area = "+ area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = "+ area);
	}
}
