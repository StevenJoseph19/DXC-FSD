package m9.v3_StringMethods_1;

import static java.lang.System.out;

public class StringMethods_1 {

	public static void main(String[] args) {
		out.println("\n** String Methods, Part 1 ** \n");

		String str = new String("Hello World!");
		String str2 = new String("Hello World!");
		out.println(str == str2); // false
		
		 
		out.println(str.equals(str2)); //true
		
		String str3 = "hello World!";
		out.println(str.equals(str3)); //false
		
		out.println(str.equalsIgnoreCase(str3)); //true
		
		str = "\tHello \"cruel\" World!\n";
		
		out.println(str.length()); 
		out.println(str); 
		
		str = "Hello World!";
		str2 = str.toUpperCase(); // "HELLO WORLD!"
		str3 = str.toLowerCase(); // "hello world!"
		
		out.println(str== str2 || str == str3 || str2 == str3); // false
		
		str = "Love For All, Hatred For None";
		out.println(str.startsWith("Lov")); // true
		out.println(str.startsWith("luv")); // false
		
		out.println(str.endsWith("one")); // true
		out.println(str.endsWith("Non")); // false
		
		
		str = "Hello, my name is Richard";
		out.println(str.contains("Rich")); // true
		out.println(str.contains("Rick")); // false
		
		str = "Hi there!   ";
		str2 = str.trim();
		out.println(str2.length()); // 9

		str = "\t\b   \"Hi there!\"   \\\r\n\f";
		str2 = str.trim();
		out.println(str2.length()); // 15
		
		
		
		
		
		
		
	}

}
