package abstractClass;

public abstract class Question04 {

	public static void main(String[] args) {
//		Method overloading is possible in abstract class
//		create abstract class as  parent 
//		create two abstract methods with same name one with int parameter and one without parameter but method name should be same
//		 Extends the abstract class with main class
//		Provide the implementation two methods
//		In main method by creating the object on main class  with parent class instance and call those 
//		two methods in the main method
//		output
//		abstract method1 implementation without argument in main class
//		abstract method2 implementation with argument in main class
        
		methods obj=new main();
		obj.M1();
		obj.M1(5);
	}

}
   abstract class methods{
	public   abstract void M1();
    public    abstract void M1(int a);
   }
   
 class main extends methods{
	  public void M1() {
		  System.out.println("abstract method1 implementation without argument in main class");
	  }
	  public void M1(int a) {
		  System.out.println("abstract method2 implementation with argument in main class");
	
		
	}
	  
  }