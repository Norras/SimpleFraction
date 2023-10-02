
public class Fraction {
	
	private int num;
	private int den;
	private static final int[] ZERO = {0,1};
	private static final int[] UN = {1,1};
	
	public Fraction(int num,int den) {
		this.num=num;
		this.den=den;
	}
	
	public Fraction(int num) {
		this.num=num;
		den=1;
	}
	
	public Fraction() {
		num=0;
		den=1;
	}

	public String toString() {
		return "Je suis la fraction "+num+"/"+den;
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}
	
	public double getValue() {
		Number nb=(num*1.0)/den;
		return nb.doubleValue();
	}
	
	
}
