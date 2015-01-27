package homeExercise;

public class Exercise21UniqueCountry {
	public static void main(String args[]){
		Exercise20Country[] duplicateCountryArr = new Exercise20Country[10];
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
		duplicateCountryArr[0]=can1;
		duplicateCountryArr[1]=can2;
		duplicateCountryArr[2]=usa1;
		duplicateCountryArr[3]=usa2;
		duplicateCountryArr[4]=ita1;
		duplicateCountryArr[5]=ita2;
		duplicateCountryArr[6]=esp1;
		duplicateCountryArr[7]=esp2;
		duplicateCountryArr[8]=eng1;
		duplicateCountryArr[9]=eng2;
		
		Exercise20Country[] uniqueCountryArr = new Exercise20Country[5];
		int arrayIndex=0;
		Exercise20Country prevCountry = null;
		for(int i=0; i<10; i++){
			if(i == 0){
				uniqueCountryArr[arrayIndex] = duplicateCountryArr[i];
				prevCountry = uniqueCountryArr[i];
				arrayIndex++;
				continue;				
			}else{
				Exercise20Country currentCountry = duplicateCountryArr[i];
				if(!prevCountry.equals(currentCountry)){
					uniqueCountryArr[arrayIndex] = currentCountry;
					arrayIndex++;
					prevCountry = currentCountry;
					continue;
				}
			}
			System.out.println("Going to next step");
		}
		System.out.println("Printing main array with size of : "+duplicateCountryArr.length);
		for(Exercise20Country country : duplicateCountryArr){
			System.out.println("Country code is " +country.getCountryCode());
		}
		System.out.println("--------------------------------------------");
		System.out.println("Printing unique array with size of :"+uniqueCountryArr.length);
		for(Exercise20Country country : uniqueCountryArr){
			System.out.println("Country code is " +country.getCountryCode());
		}
	}
}
