package methods;

public class Question09 {

	public static void main(String[] args) {
//
//create multiple methods  with same name but should different in the type of argument
//method1 with int type parameter
//method2 with String type parameter
//method3 with double type parameter
//method4 with float type parameter
//
//and write the logic in that method to print respective value based on the parameter value you passed in the method type 
//and call the method in main method with values 
//
//Output should be
//
//100
//SyntaxSolutions
//100.09
//200.0998
		
		Question09 obj=new Question09();
		obj.method1(100);
        obj.method2("SyntaxSolutions");
        obj.method3(100.09);
		obj.method4(200.0998f);
	}
	void method1(int i) {
		System.out.println(i);
	}void method2(String s){
		System.out.println(s);
	}void method3(double d){
		System.out.println(d);
	}void method4(float f){
		System.out.println(f);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
