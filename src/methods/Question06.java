package methods;

public class Question06 {

	public static void main(String[] args) {
//		For you to do 
//			create one method and  pass a String  as single parameter in method 
//			and write the logic for that method in println statement two print twice 
//			and call the method in main method pass the the String as 
//			"Don't make me say this twice!"

		Question06 obj=new Question06();
	
		obj.method("s");
       
	}
	
	void method(String s) {
		for(int i=0;i<2;i++) {
	
		System.out.println("Don't make me say this twice");
		
		
	}

}
}