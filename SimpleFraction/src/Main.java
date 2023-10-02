
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SimpleFraction !");
		
		Fraction f=new Fraction();
		assert f.toString() == "Je suis la fraction 0/1";
		System.out.println(f.toString());
		
		Fraction f1=new Fraction(5);
		assert f1.toString() == "Je suis la fraction 5/1";
		System.out.println(f1.toString());
		
		Fraction f2=new Fraction(4,7);
		assert f2.toString() == "Je suis la fraction 4/7";
		System.out.println(f2.toString());
	}

}
