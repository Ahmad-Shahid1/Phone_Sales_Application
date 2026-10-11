public class PolymorphismPhoneTest{ // this is the main class through which we will test polymorphism with phones
	public static void main(String [] args){// main method

		PhonesForSale phone1= new PhonesForSale("Apple","iPhone 16","IOS",799.99); // this is the first phone object which specifies the brand, model, operating system and price

		PhonesForSale phone2= new PhonesForSale("Google","Pixel 3","Android",699.99); // this is the second phone object which specifies the brand, model, operating system and price

		PhoneAbstract[] phones=new PhoneAbstract[2]; // creates an array to display polymorphism

		phones[0]=phone1; // this assigns the first phone to the first element in the array we just created
		phones[1]=phone2; // this assigns the second phone object to the second element in the array we just created

		System.out.println("Both type of phones have been processed."); 
		System.out.println(); // adds space

		for (PhoneAbstract currentPhone: phones){ // this loop allows us to iterate over the phone objects
			System.out.println(currentPhone); // prints and calls the toString method from PhonesForSale java file

			if (currentPhone.getBrand() == "Apple"){

				PhonesForSale phoneSale= (PhonesForSale) currentPhone; //
				System.out.println("Apple products are $50 off, new price is: $"+phoneSale.saleListing()); // calls the saleListing method() and allows us to print the sale price
			}

			System.out.println(); // this line adds space between the outputs 
		}
	}
}
				
