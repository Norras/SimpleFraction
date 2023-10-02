
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SimpleFraction !");
		Fraction f2bis=new Fraction(8,14);
		Fraction f=new Fraction();
		Fraction f1=new Fraction(5);
		Fraction f2=new Fraction(4,7);
		
		
		assert f.toString().equals("Je suis la fraction 0/1") == true;
		System.out.println(f.toString());
		
		assert f1.toString().equals("Je suis la fraction 5/1") == true;
		System.out.println(f1.toString());
		
		assert f2.toString().equals("Je suis la fraction 4/7") == true;
		System.out.println(f2.toString());
		
		
		assert f2.getValue() == 4.0/7;

		
		assert f1.add(f2) == 39.0/7;
		assert f1.add(f) == 5;

		
		assert f1.equal(f2) == false;
		assert f2.equal(f2bis) == true;
		
		
		assert f1.compare(f) > 0;
		assert f2.compare(f2bis) == 0;
		assert f2.compare(f1) < 0;
		
		
		 // Vérifiez avec le code ci-dessous
		 Number aNumber = java.math.BigDecimal.ONE;
		 Number anotherNumber = new Fraction(1, 2);
		 System.out.println(anotherNumber.doubleValue());
		 assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
		
	}

}
