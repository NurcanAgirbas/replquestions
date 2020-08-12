package abstractClass;

public abstract class Question03 {

	public static void main(String[] args) {
//		Create abstract class as  parent 
//		Create default constructor in the abstract class 
//		Extends the abstract class with main class
//		Declare default constructor in the main class 
//		In main method create the object  for the main class 
//
//		Output:
//		abstract class Constructor
//		Main class Constructor
    parent obj=new main();
   
		
	}

}

abstract class parent{
	parent(){
		System.out.println("abstract class Constructor");
		
	}
} 

class main extends parent{
	main(){
		System.out.println("Main class Constructor");
	}
}
