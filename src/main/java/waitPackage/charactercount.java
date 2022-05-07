package waitPackage;

public class charactercount {

	public static void main(String[] args) {
	
		String m="123";
		
		String n="346";
		
		m= m+n;
		n= m.substring(0, m.length()-n.length());
		m=m.substring(n.length());
		
		System.out.println(m);
		System.out.println(n);
		
		int a =Integer.parseInt(m);
		
		int b= Integer.parseInt(n);
		
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

		
		String str= "Nayana";
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
		
			if(str.charAt(i)!=' ') {
				
				count++;
				
			}
			
			System.out.println(count);
		}
	}

}
