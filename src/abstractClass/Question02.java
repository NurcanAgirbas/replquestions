package abstractClass;

public abstract class Question02 {

//	Create abstract class as  parent 
//	Create one abstract method and another normal instance method in the abstract class with implementation 
//	 Extends the abstract class with main class
//	Provide the implementation for one abstract method which is declared in the parent class
//	In main method by creating the object on main class with parent class instance and call those 
//	two methods in the main method 
//
//	Output: 
//
//	abstract method1 implementation in main class
//	abstract method2 implementation in parent class

	public static void main(String[] args) {
		A obj=new B();
		obj.M1();
		obj.M2();
		
		

	}

}
 abstract class A {
	 public abstract void M1();
	 public  void M2() {
		System.out.println("abstract method2 implementation in parent class"); 
	 }
 }
  class B extends A{
	  public void M1() {
		  System.out.println("abstract method1 implementation in main class");
	  }
	  
  }
 
 
 
 
 
 
 
 
 