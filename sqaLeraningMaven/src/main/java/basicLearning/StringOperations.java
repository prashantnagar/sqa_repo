package basicLearning;

public class StringOperations {

	public static void main(String[] args) {
		String str1 = "Java classes are funny";
		String str2 = "are they really?";

		System.out.println(str1.lastIndexOf('s'));
		int length = str1.length();
		System.out.println("length of str1 is : "+length);

		String subStr1 = str1.substring(1,length);
		System.out.println("Substring of str1 is : "+subStr1);

		int indexStr2 = str2.indexOf("b");
		System.out.println("Index of ' are' in str2 is : "+indexStr2);
		
		System.out.println(str1.substring(str1.indexOf("are ")+4));
		
		System.out.println("vowel contains any vowel : "+checkVowel("vowel"));				
	}
	
	public static boolean checkVowel(String vowelStr){
		if(vowelStr.indexOf('a') > -1 ||vowelStr.indexOf('e') > -1||
				vowelStr.indexOf('i') > -1||vowelStr.indexOf('o') > -1 ||
				vowelStr.indexOf('u') > -1){
			System.out.println("String contains vowels");
			return true;
		}
		return false;
	}
}
