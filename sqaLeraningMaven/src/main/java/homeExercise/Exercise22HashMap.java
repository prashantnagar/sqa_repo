package homeExercise;

import java.util.HashMap;
import java.util.Map;

import classObject.PersonOvrldCnstr;

public class Exercise22HashMap {

	public static void main(String[] args) {
		Exercise22HashMap obj = new Exercise22HashMap();
		obj.hashMapSample();
	}
	
	public void hashMapSample(){
		Map<String,PersonOvrldCnstr> personMap = new HashMap<String,PersonOvrldCnstr>(); 
		
		PersonOvrldCnstr p1 = new PersonOvrldCnstr("p1",32,"243-543-5343");		
		personMap.put(p1.getSsn(), p1);
		//personMap.put("243-543-5343", p1);
		
		PersonOvrldCnstr p2 = new PersonOvrldCnstr();
		p2.setName("p2");
		p2.setAge(33);
		p2.setSsn("345-354-7575");
		personMap.put(p2.getSsn(), p2);
		
		//Similarly create p3 to p9		
		PersonOvrldCnstr p10 = new PersonOvrldCnstr("p10",52,"543-788-6889");		
		personMap.put(p10.getSsn(), p10);
		
		for(Map.Entry<String, PersonOvrldCnstr> entry : personMap.entrySet()){
			String key = entry.getKey();
			PersonOvrldCnstr p = entry.getValue();
			System.out.println("*************************");
			System.out.println("Key is : "+key);
			System.out.println("Person name is : "+p.getName()+", age is : "+p.getAge());
		}
	}

}
