package methods;

public class Question02 {

	public static void main(String[] args) {

//For you to do 
//create one method without any parameters  
//method name as newLine
//and write the logic for that method in println statement as "newLine method implementation"
//in main method try to call that method three times so you can have 3 outputs of "newLine method implementation"
    Question02 obj=new Question02();
    for(int i=0;i<3;i++) {
   obj.newLine(); 

	}}
	
	void newLine() {
		System.out.println("newLine method implementation");
	}

}
