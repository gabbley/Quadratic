//Javadocs what
//https://github.com/gabbley/Quadratic

public class QuadFormula {
	
	private double a;
	private double b;
	private double c;

	QuadFormula(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double discriminant() {
		return Math.pow(b, 2) - (4*a*c);
	}
	
	public double[] roots() {
		double[] allRoots = new double[1];
		double d = discriminant();
		
		if (a==0) {
			throw new IllegalArgumentException("a=0");
		}
		if (d<0) return null;
		if (d==0) {
			allRoots = new double[1];
			allRoots[1]= -b/2*a;
		}
		
		if (d>0) {
			allRoots = new double[2];
			double rootOne = Math.sqrt(discriminant()/2*a);
			double rootTwo = Math.sqrt(discriminant()/2*a);
			allRoots[0] = rootOne;
			allRoots[1] = rootTwo;
			return allRoots;
		}
		
		return allRoots;
	
	}
	

}
