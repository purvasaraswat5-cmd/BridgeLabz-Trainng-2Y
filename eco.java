package oops;
abstract class Product{
	private int id;
	private String name;
	private double basePrice;
	private double discountedPrice;
	
	public int getid() {return id;}
	public void setid(int id) {
		this.id=id;
	}
	public String getname() {return name;}
	public void setname(String name) {
		this.name=name;
	}
	public double getbasePrice() {return basePrice;}
	public void setbasePrice(double basePrice) {
		this.basePrice=basePrice;
	}
	void getDiscountedPrice(){
		discountedPrice= basePrice-(basePrice/10);
		
	}
	void productinfo() {
		System.out.println(id+" "+name+" "+basePrice);
		getDiscountedPrice();
	}
}
public class Eco {

}
