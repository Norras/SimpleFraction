
public class Fraction extends Number{
	
	private int num;
	private int den;
	public static final int[] ZERO = {0,1};
	public static final int[] UN = {1,1};
	
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
	
	public double getValue() { // cette méthode est devenue inutile mais on doit la laisser j'imagine
		Number nb=(num*1.0)/den;
		return nb.doubleValue();
	}
	
	public double add(Fraction f) {
		Number n1=(num*1.0)/den;
		Number n2=(f.getNum()*1.0)/f.getDen();

		return n1.doubleValue()+n2.doubleValue();
	}
	
	public boolean equal(Fraction f) {
		Number n1=(num*1.0)/den;
		Number n2=(f.getNum()*1.0)/f.getDen();
		
		return n1.equals(n2);
	}
	
	public int compare(Fraction f) {
		Double n1=(num*1.0)/den;
		Double n2=(f.getNum()*1.0)/f.getDen();
		
		return n1.compareTo(n2);
	}

	
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int)getValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long)getValue();
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float)getValue();
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return getValue();
	}
	
	
}
