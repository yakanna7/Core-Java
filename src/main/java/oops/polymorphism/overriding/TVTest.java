//Java program to implement overriding 
package oops.polymorphism.overriding;

class BlackAndWhiteTV {
	private String company;
	private String size;
	private double price;

	public BlackAndWhiteTV(String company, String size, double price) {
		this.company = company;
		this.size = size;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void increaseVolume() {
		System.out.println("To increase volume Turn audio tuner right");
	}

	public void decreaseVolume() {
		System.out.println("To decrease volume Turn audio tuner left");
	}

	public void changeChannel() {
		System.out.println("To change channel Turn tuner left or right");
	}
}

class ColorTV extends BlackAndWhiteTV {
	private String screenType;

	public ColorTV(String company, String size, double price, String screenType) {
		super(company, size, price);
		this.screenType = screenType;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public void increaseVolume() {
		System.out.println("To increase volume Press valume increase button");
	}

	public void decreaseVolume() {
		System.out.println("To decrease volume Press volume decrease button");
	}

	public void changeChannel() {
		System.out.println("To change channel Press channel change button up or down");
	}

}

class TVTest {

	public static void main(String args[]) {
		BlackAndWhiteTV tv = new BlackAndWhiteTV("Videocon", "12x8 inches",
				4000);

		System.out.println("Black and White TV details are");
		System.out.println("Company name is " + tv.getCompany());
		System.out.println("Size is " + tv.getSize());
		System.out.println("Price is " + tv.getPrice()+" rs");
		tv.increaseVolume();
		tv.decreaseVolume();
		tv.changeChannel();

		tv = new ColorTV("Samsung", "32x24 inches", 28000, "LCD");

		System.out.println("\nColor TV details are");
		System.out.println("Company name is " + tv.getCompany());
		System.out.println("Size is " + tv.getSize());
		System.out.println("Price is " + tv.getPrice()+" rs");
		System.out.println("Screen Type is " + ((ColorTV) tv).getScreenType());
		tv.increaseVolume();
		tv.decreaseVolume();
		tv.changeChannel();
	}
}
