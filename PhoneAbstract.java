public abstract class PhoneAbstract{ // allows us to declare an abstract class (Abstract class cannot be instantiated directly)
	private String brand; // allows us to declare a variable
	private String model; //  allows us to declare a variable
	private String operatingSystem; // allows us to declare a variable
	public PhoneAbstract (String brand,String model,String operatingSystem){ // this is a constructor that initializes the operating system,brand and model
		this.brand = brand;
		this.model= model;
		this.operatingSystem=operatingSystem;
	}
	public String getBrand(){ // gets the brand value from the private variable
		return brand;
	}
	public void setBrand(String brand){ // this allows us to update the brand of the phone
		this.brand=brand;
	}
	public String getModel(){ // gets the brand value from the private variable
		return model;
	}
	public void setModel(String model){
		this.model=model;
	}
	public String getOperatingSystem(){ // gets the brand value from the private variable
		return operatingSystem;
	}




	public abstract double saleListing(); // this abstract method returns listing price of the phone
}

