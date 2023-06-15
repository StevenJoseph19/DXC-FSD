package m9.v5_StringBuilder_1;

import static java.lang.System.out;

public class StringBuilder_1 {

	public static void main(String[] args) {
		out.println("\n** Using StringBuilder, Part 1 ** \n");

		String str1 = new String("Xello");
		out.println(str1); // "Xello"

		String str2 = str1.replace('X', 'H');
		out.println(str2); // "Hello"
		
		out.println(str1 == str2); // false
		
		StringBuilder strBldr1 = new StringBuilder("Xello");
		out.println(strBldr1); // "Xello"
		
		StringBuilder strBldr2 = strBldr1.replace(0, 1, "H");
		out.println(strBldr2); // "Hello"
		out.println(strBldr1); // "Hello"
		out.println(strBldr1 == strBldr2); // true
		
		strBldr1 = new StringBuilder();
		out.println(strBldr1.length()); // 0
		out.println(strBldr1.capacity()); // 16
		
		strBldr1 = new StringBuilder(100);
		out.println(strBldr1.length()); // 0
		out.println(strBldr1.capacity()); // 100
		
		strBldr1 = new StringBuilder("Hello");
		out.println(strBldr1.length()); // 5
		out.println(strBldr1.capacity()); // 21
	}

}
