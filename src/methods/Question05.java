package methods;

public class Question05 {

	public static void main(String[] args) {
//		For you to do 
//			create one method without any parameters  
//			method name as forLoop as void 
//			and write the logic  in the method to print 1 to 10 numbers
//			call the method in the main method
//			Output:
//			1
//			2
//			3
//			4
//			5
//			6
//			7
//			8
//			9
//			10

		Question05 obj=new Question05();
		obj.forLoop();
	}
	void forLoop() {
		for(int i=1;i<=10;i++)
		System.out.println(i);
	}

}
