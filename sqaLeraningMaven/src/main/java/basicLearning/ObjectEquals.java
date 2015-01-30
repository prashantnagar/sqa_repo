package basicLearning;

import classObject.PersonOvrldCnstr;

public class ObjectEquals {
	
	public static void main(String args[]){
		PersonOvrldCnstr p1 = new PersonOvrldCnstr("John",21,"432");
		PersonOvrldCnstr p2 = new PersonOvrldCnstr("John",21,"431");
		//"==" always compares the memory address of objects.
		System.out.println("p1==p2 = "+(p1 == p2));
		System.out.println("p1.equals(p2) = "+(p1.equals(p2)));
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1 == s2 = "+(s1==s2));
		System.out.println("s1.equals(s2) = "+(s1.equals(s2)));
	}
}
