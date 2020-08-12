package constructor;

public class Question02 {

public static void main(String[] args) {
//		 1. Complete the Car.java class:
//			 Include the following class variables:
//			 * make
//			 * model
//			 * numberOfDoors
//			 * topSpeed
//			 * price
//			 All class variables should be declared case sensitive
//			 Write four constructors:
//			 * The first constructor(with all parameters)
//			 * A secondary constructor that does not include numberOfDoors, which should default to 4
//			 * A third constructor that does not include make and model; both default to "unknown"
//			 * A fourth constructor that does not include topSpeed and price; default to 90 and 0 respectively.
//			 2. Test your code with the Main.java class:
//			 Create several Car objects using all Constructors and print their fields/states to make sure it's correct. print your objects with variables in your output each object
//			 Output: 
//			 Toyota Prius 4 120 30000.0
//			 Toyota Prius 4 120 30000.0
//			 unknown unknown 4 120 30000.0
//			 Toyota Prius 4 90 0.0

	Car.numberOfDoors= 4;
	Car.make= "Unknown";
	Car.model= "Unknown";
	
	Car.topSpeed= 90;
	Car.price= 0.0;
	
	Car obj= new Car ("Toyota", "Prius", 4, 120, 30000.0);
	
	Car obj1= new Car ("Toyota", "Prius", 120, 30000.0);
	
	Car obj2= new Car (4, 120, 30000.0);
	
	Car obj3= new Car ("Toyota", "Prius", 4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
