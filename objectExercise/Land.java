package objectExercise;

public class Land extends Property {
	//土地クラス
	private double floorPlan;
	
	Land(String property, String type, int price){
		super(property, type, price);
		this.floorPlan = floorPlan;
	}
	
	public double setFloorPlan() {return floorPlan;}
	public void getFloorPlan() {this.floorPlan = floorPlan;}
	
	
	public void greeting() {
		super.greeting();
		System.out.println("広さ:" + this.floorPlan + "m");
	}
}