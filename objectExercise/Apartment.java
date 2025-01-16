package objectExercise;

public class Apartment extends Property {
	
	private int ariea;

	Apartment(String property, String type, int price) {
		super(property, type, price);
		this.ariea = ariea;
	}
	public int setAriea() {return ariea;}
	public void getAriea() {this.ariea = ariea;}
	
	
	public void greeting() {
		super.greeting();
		System.out.println("間取り:" + this.ariea + "LDK");
	}
}