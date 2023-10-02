
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SimpleFraction !");
		
		Fraction f=new Fraction();
		assert f.toString().equals("Je suis la fraction 0/1") == true;
		System.out.println(f.toString());
		
		
		Fraction f1=new Fraction(5);
		assert f1.toString().equals("Je suis la fraction 5/1") == true;
		System.out.println(f1.toString());
		
		Fraction f2=new Fraction(4,7);
		assert f2.toString().equals("Je suis la fraction 4/7") == true;
		System.out.println(f2.toString());
		
		assert f2.getValue() == 4/7;

		assert f1.add(f2) == 39.0/7;
		assert f1.add(f) == 5;
		
		
		Fraction f2bis=new Fraction(8,14);
		assert f1.equal(f2) == false;
		System.out.println(f2.equal(f2bis));
		assert f2.equal(f2bis) == true;
		
	}

}
