package basicLearning;

public class FunctionExamples {
	
	/*
	 * Write a function "check20" which takes an int parameter and print 
	 * the message on screen that “number is greater than 10” 
	 * otherwise it should print “number is smaller then 10”
	 */
	
	public static void main(String[] args) {
		int sum = calcSum(2,2);
		System.out.println("Value one is : "+sum);
		
		int value2 = calcSum(3,65);
		System.out.println("Value two is : "+value2);
		
		printName("Java");		
		printName("Apple");
		
		for(int i=0; i<10; i++){
			printName("i is : "+i);
		}
	}
	
	
	public static int calcSum(int a, int b){
		int sum = a + b;
		return sum;
	}
	
	public static void printName(String str){
		System.out.println("name is : "+str);
	}

}
