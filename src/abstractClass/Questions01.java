package abstractClass;

public abstract class Questions01 {
	
	public static void main(String[]args) {
//		Create abstract class as  parent 
//		Create two abstract methods  
//		Extends the abstract class with main class and provide the implementation for abstract methods which are declared in the parent class
//		In main method by creating the object on main class with parent class instance and call those 
//		two methods in the main method 
//		Output would be
//		abstract method1 implementation in main class
//		abstract method2 implementation in main class

		Question01 obj=new B();
		obj.M1();
		obj.M2();
	}	
		
		public 	abstract void M1();
		public 	abstract void M2();
			
		}
  
    class B extends Question01{
	   int name;
    	public void M1() {
    		System.out.println("abstract method1 implementation in main class");
    	
    	}
    	public void M2() {
    		System.out.println("abstract method2 implementation in main class");
    	
			
	
			
		}
     }

	   
   