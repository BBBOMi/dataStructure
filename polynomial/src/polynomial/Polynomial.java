package polynomial;

public class Polynomial {
	private int degree;
	private double[] coef;
	Polynomial c;
	
	public Polynomial(int degree, double[] coef) {
		this.degree = degree;
		this.coef = coef;
	}
	
	public Polynomial(int degree) {
		this.degree = degree;
		coef = new double[degree + 1];
		
		for(int i=0; i<coef.length; i++) {
			coef[i] = 0;
		}
	}
	
	public int getDegree() {
		return degree;
	}
	
	public double getCoef(int expo) {
		return coef[expo];
	}
	
	public void setCoef(int expo, double coefValue) {
		coef[expo] = coefValue;
	}
	
	public boolean isZero(Polynomial p) {
		for(int i=0; i<=p.getDegree(); i++) {
			if(p.getCoef(i) != 0)
				return false;
		}
		return true;
	}
	
	public Polynomial addPoly(Polynomial b) {
		if(degree >= b.getDegree()) {
			c = new Polynomial(degree);
			for(int i=0; i<=b.getDegree(); i++)
				c.setCoef(i, coef[i] + b.getCoef(i));
			for(int i=degree; i>b.getDegree(); i--) {
				c.setCoef(i, coef[i]);
			}
		} else {
			c = new Polynomial(b.getDegree());
			for(int i=0; i<=degree; i++)
				c.setCoef(i, coef[i] + b.getCoef(i));
			for(int i=b.getDegree(); i>degree; i--) {
				c.setCoef(i, b.getCoef(i));
			}
		}
		return c;	
	}
	
	@Override
	public String toString() {
		String str = "";
		for(int i=degree; i>0; i--)
			str += (coef[i] == 0)? "" :((i!= degree) ? " + " : "") + coef[i] + "X^" + i;
			
		if(coef[0] != 0)
			str += " + " +coef[0];
		return str;
	}
}
