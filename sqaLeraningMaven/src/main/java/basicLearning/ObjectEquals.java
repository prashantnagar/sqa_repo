package basicLearning;

import classObject.OverloadedConstructor;

public class ObjectEquals {
	
	public static void main(String args[]){
		OverloadedConstructor p1 = new OverloadedConstructor("John",21,"432");
		OverloadedConstructor p2 = new OverloadedConstructor("John",21,"431");
		//"==" always compares the memory address of objects.
		System.out.println("p1==p2 = "+(p1 == p2));
		System.out.println("p1.equals(p2) = "+(p1.equals(p2)));
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1 == s2 = "+(s1==s2));
		System.out.println("s1.equals(s2) = "+(s1.equals(s2)));
	}
}
