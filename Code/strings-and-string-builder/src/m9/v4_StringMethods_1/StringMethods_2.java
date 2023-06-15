package m9.v4_StringMethods_1;

import static java.lang.System.out;

public class StringMethods_2 {

	public static void main(String[] args) {
		out.println("\n** String Method Chaining ** \n");

		String str = new String("Hello World!");
		Character chr = str.charAt(1);
		out.println(chr); // 'e'
		
		 str = "Mississippi";
		 int index = str.indexOf("s");
		 out.println(index); // 1
		 index = str.indexOf("is");
		 out.println(index); // 1
		
		 index = str.indexOf('i', 5);
		 out.println(index); // 7
		
		 index = str.indexOf("ss", 4);
		 out.println(index); // 5
		
		 
		 String substr = str.substring(8); // (ppi)
		 substr = str.substring(5,8); // (ssi)
		
		 str = "MISSISSIPPI";
		 String str2 = str.replace('I', 'x');
		 out.println(str2); // (MxSSxSSxPPx)
		 
		 str2 = str.replace("SS", "xx");
		 out.println(str2); // (MIxxIxxIPPI)
		 
		 String str3 = str2.replace("xx", "ss")
				 		 .toLowerCase()
				 		 .replace('m', 'M');
		 
		 out.println(str3); // "Mississippi"
		 
	}

}
