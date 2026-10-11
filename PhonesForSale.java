public class PhonesForSale extends PhoneAbstract{ // this subclass extends PhoneAbstract // inherits methods and fields of PhoneAbstract
	private double price;


	public PhonesForSale(String brand, String model, String operatingSystem, double price ){
		super(brand, model, operatingSystem);

		if (price <0.0)
			throw new IllegalArgumentException("Phone's price shouldn't be less than zero"); // this is the exception handling in which we're using throw to raise an exception if price is invalid
		this.price= price;
	}
	public void setPrice (double price){
		if (price <0.0)
			throw new IllegalArgumentException("Phone's price shouldn't be less than zero"); // this is the exception handling in which we're using throw to raise an exception if price is invalid
		this.price= price;
	}

	public double getPrice(){
		return price;
	}
	@Override // overriding 
	public String toString(){ // enables us to override to toString() method
		return String.format ("The Brand of phone is: %s%nThe price before sale is: $%.2f%nThe operating system version is: %s", getBrand(), getPrice(), getOperatingSystem());
	}
	@Override
	public double saleListing(){ // overrding
		return (getPrice()-50); // enables us to return the price as the sale listing price of the phone
	}
}
