
public class ExemplosClasseString {

	public static void main(String[] args) {
		String nome = "Pedro";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		nome = nome.toUpperCase();
		System.out.println(nome);
		
		//-------------------------------------------------
		
		String s1 = "Pedro";
		String s2 = "Pedro";
		System.out.println("s1 == s2? " + (s1 == s2));
		
		String s3 = new String("Pedro");
		System.out.println("s3 == s1? " + (s3 == s1));
		
		System.out.println("s1.equals(s2)? " + (s1.equals(s2)));
		System.out.println("s3.equals(s1)? " + (s3.equals(s1)));
		
		String s4 = "PeDrO";
		System.out.println("s1.equals(s4)? " + (s1.equals(s4)));
		System.out.println("s1.equalsIgnoreCase(s4)? " + (s1.equalsIgnoreCase(s4)));
	}
	
}






