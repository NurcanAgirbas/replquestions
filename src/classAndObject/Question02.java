package classAndObject;

public class Question02 {
    String color;
	int modelyear;
	String name;
	public static void main(String[] args) {
//		create a class named 'Main' with specific attributes.
//		For you to do
//		Create two object in which you will be assigning the following values.
//		carColor='Black'
//		carModelYear=2019
//		carName='BMW'
//		carColor='White'
//		carModelYear=2018
//		carName='Toyota'
//		Car color is Black and car model year is 2019 and car name is BMW
//		Car color is White and car model year is 2018 and car name is Toyota
		
		Question02 car1=new Question02();
		car1.color="Black";
		car1.modelyear=2019;
		car1.name="BMW";
		car1.Car();
		Question02 car2=new Question02();
		car2.color="White";
		car2.modelyear=2018;
		car2.name="Toyota";
         car2.Car();
	}
	void Car() {
		System.out.println("Car color is " +color+ " and car model is  " +modelyear+ " and car name is " + name);
		
	}

}
