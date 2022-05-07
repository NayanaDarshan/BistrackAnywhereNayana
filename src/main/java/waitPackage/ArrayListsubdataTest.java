package waitPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayListsubdataTest {

	public static void main(String[] args) {
		
		ArrayList<String> ar =  new ArrayList<String>(Arrays.asList("Nayana","Smira", "Smaya", "Sharvika"));
		
		for(String str : ar) {
			System.out.println("whole string data is===>"+str);
			
			if(str.length()>=3) {
				
				System.out.println("The sub string data is===>"+ str.substring(str.length()-3));
			}
			
		}
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("Nayana", 1);
		hmap.put("Smira", 2);
		hmap.put("Smaya", 4);
		hmap.put("sharvika", 5);
		
		hmap.forEach((k,v) -> System.out.println("Key====>" +k +"and value is===>"+v));
		

	}

}
