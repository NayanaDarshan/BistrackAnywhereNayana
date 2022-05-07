package waitPackage;

public class CountTest {

	public static void main(String[] args) {
	
		String m= "12345";
		
		String n= "67689";
		
		m= m+n;
		n= m.substring(0, m.length()-n.length());
		m= m.substring(n.length());
		
		System.out.println(m);
		System.out.println(n);
				
	int a=10;
	int b=20;
	
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	}

}
