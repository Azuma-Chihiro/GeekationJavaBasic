package objectExercise;

public abstract class Property {
	//フィールド 物件名, 物件所有者, 物件価格, 間取り
	private String property;
	private String type;
	private int price;

	//スーパークラス　インストラクタ
	Property(String property, String type, int price) {
		this.property = property;
		this.type = type;
		this.price = price;
	}
	
	//オーバーロード
	//public Property() {
	
	public void greeting() {
		System.out.println("========================================");
		System.out.println("物件名:いい感じの");
		System.out.println("物件所有者名:山田 " + this.type + "太郎" );
		System.out.println("物件種別:" + this.type);
		System.out.println("物件価格: " + this.price + "円");
	}

	//getter
	public String getProperty() {return property;}
	public String getType() {return type;}
	public int getPrice() {return price;}

	//setter
	public void setProperty(String property) {this.property = property;}
	public void setType(String type) {this.type = type;}
	public void setPrice(int price) {this.price = price;}
}
