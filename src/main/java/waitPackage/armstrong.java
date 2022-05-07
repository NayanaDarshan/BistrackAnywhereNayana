package waitPackage;

import java.util.Arrays;

public class armstrong {

	public static void main(String[] args) {
		
		String s1= "race5";
		String s2="care6";
		
		
		if(s1.length()==s2.length()) {
			
			char[] ch=s1.toCharArray();
			
			char[] ch1= s2.toCharArray();
			
            Arrays.sort(ch);
            
            Arrays.sort(ch1);
            
            if(Arrays.equals(ch, ch1)) {
            	System.out.println("Armstrong");
            }
            
            else {
            	System.out.println("Not Armsstrong");
            }
		}

	}

}
