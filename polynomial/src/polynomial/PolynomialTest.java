package polynomial;

public class PolynomialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] coefArrayA = {0, 5, 3, 9};
		double[] coefArrayB = {1.8, 2.5, -3, 1, 8};
		
		Polynomial a = new Polynomial(3, coefArrayA);
		Polynomial b = new Polynomial(4, coefArrayB);
		Polynomial c = a.addPoly(b);
		
		System.out.println("A(x) = " + a);
		System.out.println("B(x) = " + b);
		System.out.println("C(x) = " + c);
	}

}
