package junitTests;

public class TestExer25PrimeNumber {	
   
	public static Boolean isPrimeNumber(final Integer primeNumber) {
      for (int i = 2; i < primeNumber; i++) {
         if (primeNumber % i == 0) {
            return false;
         }
      }
      return true;      
   }
}
