package static_example;

public class Calculator {
	
	public static void main(String args[]){
		int sum = add(2,2);
		System.out.println(sum);
		
		float sumF = add(3.0f,2.0f);
		System.out.println(sumF);
	}
	
	public static int add(int a, int b){
		System.out.println("inside int type");
		return a+b;
	}
	
	public static float add(float a, float b){
		System.out.println("inside float type");
		return a + b;
	}
	
	public static int mult(int x, int y) { 
		return x*y; 
	}
	
	public static int sub(int x, int y) { 
		return x-y; 
	}
	
	public static int sub(int x, int y, int z) { 
		return x-y-z; 
	}
	
	public static Float divide(float x, float y){
		return x/y;
	}
}
