package basicLearning;

public class IfExample {
	
	public static void main(String args[]){
		int a = 2;
		int b = 2;
		int c=5;
		
		if(a != 2){
			System.out.println("Inside if");		
		}else if (a == b){
			System.out.println("Inside else if");
		}else{
			System.out.println("Inside else");			
		}
		System.out.println("Inside else again");
	}
}
