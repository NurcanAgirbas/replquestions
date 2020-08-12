package classAndObject;

public class Question03 {
String breed;
String name;
String color;
	
	public static void main(String[] args) {
//		Instructions from your teacher:
//			Create a Class main that should be a template for the DogClass. 
//			In this class you should specify the following attributes: breed, name, color and following behaviors: bark(), run(), play().
//			Create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
//			The output of the program should be as following:		 
//			Husky can bark
//			Husky can run
//			Husky can play
//			Bulldog can bark
//			Bulldog can run
//			Bulldog can play
//			Labrador can bark
//			Labrador can run
//			Labrador can play
		Question03 Husky=new Question03();
		Husky.breed="Husky";
		Husky.color="White";
		Husky.name="Pedro";
		Husky.bark();
		Husky.run();
		Husky.play();
		
		Question03 Bulldog=new Question03();
		Bulldog.breed="Bulldog";
		Bulldog.color="Black";
		Bulldog.name="Doggy";
		
		Bulldog.bark();
		Bulldog.run();
		Bulldog.play();
		
		Question03 Labrador=new Question03();
		 Labrador.breed="Labrador";
		 Labrador.color= "Caramel";
		 Labrador.name= "Alligator";
		 
		 Labrador.bark();
		 Labrador.run();
		 Labrador.play();
		
	}

	private void play() {
		System.out.println(breed+ " can bark");
		
	}

	private void run() {
		System.out.println(breed+ " can run");
		
	}

	private void bark() {
		System.out.println(breed+ " can play");
		
	}

}
