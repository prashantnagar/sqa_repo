package homeExercise;

public class Exercise20CountryCaller {

	public static void main (String args[]) {
	
		Exercise20Country can1 = new Exercise20Country ("CAN", "Canada", 35540419, "CN Dollar");
		Exercise20Country can2 = new Exercise20Country ("CAN", "Canada", 35500000, "Looney");
		Exercise20Country usa1 = new Exercise20Country ("USA", "United States", 319072000, "US Dollar");
		Exercise20Country usa2 = new Exercise20Country ("USA", "United States", 319072000, "Buck");
		Exercise20Country ita1 = new Exercise20Country ("ITA", "Italy", 60783711, "Euro");
		Exercise20Country ita2 = new Exercise20Country ("ITA", "Italia", 60780000, "Lira");
		Exercise20Country esp1 = new Exercise20Country ("ESP", "Spain", 46507760, "Euro");
		Exercise20Country esp2 = new Exercise20Country ("ESP", "Espana", 46500000, "Peseta");
		Exercise20Country eng1 = new Exercise20Country ("ENG", "England", 64105654, "Pound");
		Exercise20Country eng2 = new Exercise20Country ("ENG", "United Kingdom", 64105654, "Lb");
				
		printOut(can1, can2);
		printOut(usa1, usa2);
		printOut(ita1, ita2);
		printOut(esp1, esp2);
		printOut(eng1, eng2);				
	}
	
	public static void printOut(Exercise20Country cnt1, Exercise20Country cnt2) {
		System.out.println(cnt1.getCountryCode()+" == "+cnt2.getCountryCode()+" is: "+(cnt1 == cnt2));
		System.out.println(cnt1.getCountryCode()+" .equals() "+cnt2.getCountryCode()+" is: "+(cnt1.equals(cnt2)));
		System.out.println("**************************************");
	}
}
