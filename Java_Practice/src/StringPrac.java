
public class StringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = new String("ramani");
		 System.out.println(s);
		 
		 s.concat("Belekar");
		 System.out.println(s);// strings are immutable
		 
		 StringBuffer sb= new StringBuffer("ramani");
		 System.out.println(sb);
		 sb.append("belekar");
		 System.out.println(sb);//string buffer are mutable
		 
		 
		 String s1=new String("ramani");
		 System.out.println(s1==s);// False
		 System.out.println(s.equals(s1));// True string class equals is overridden for content comparison
		 
		 StringBuffer sb1=new StringBuffer("ramani");
		 System.out.println(sb1 == sb);// False
		 System.out.println(sb.equals(sb1));//False-stringBuffer class equals is not overridden for content comparison
		 
		// String constructors
		 
		// 1.
		 String str = new String("");
		 System.out.println(str.length());
		 String str1 = null;
		 System.out.println(str1);
		 
		// 2.
				 String str3 = new String("leteral");
				 System.out.println(str3);
				 
		// 3.
				 String str4 = new String(sb1);// String s = new String(StringBuffer Sb)
				 System.out.println(str4);	
				 
		// 4.
				 char[] ch = {'g','j','j'};
				 String str5 = new String(ch);// String s = new String(char[] ch)
				 System.out.println(str5);	
				 
		
		//5.   
				 byte[] b = {102,101,111};
				 String str6 = new String(b);// String s = new String(byte[] b)
				 System.out.println(str6); 
				 
				 
				 
				// String class methods 
				 String str7 = new String("ramani belekar");
				 System.out.println(str7.charAt(5));
				 
				 String str8 = "Belekar";
				 str8= str8.concat("java");
				 System.out.println(str8);
				 
				 
				 str8= str8 +"software";
				 System.out.println(str8);
				 
				 str8+="software";
				 System.out.println(str8);
				 
				 String str9 = "JAVA";
				 System.out.println(str9.equals("Java"));
				 
				 String str10 = "JAVA";
				 System.out.println(str10.equals("JAVA"));//1.
				 
				 
				 String str11 = " JAVA";
				 System.out.println(str11.equalsIgnoreCase("Java"));//2.
				 
				System.out.println( str11.substring(2));//3.
				System.out.println(str11.substring(0, 2));//4.
				System.out.println(str11.length());//5
				System.out.println(str11.toLowerCase());
				System.out.println(str11.toUpperCase());
				System.out.println(str11.trim());
				System.out.println(str11.indexOf("A"));
				System.out.println(str11.lastIndexOf("A"));
				System.out.println(str11.replace("J", "j"));
				System.out.println(str11.codePointBefore(2));
				System.out.println(str11.codePointAt(1));
				System.out.println(str11.codePointCount(1, 2));
				System.out.println(str11.toCharArray());
				System.out.println(str11.intern());
			
				System.out.println(sb1.capacity());// string buffer capacity = s.lenght()+16
				StringBuffer sb2= new StringBuffer();	
				System.out.println(sb2.capacity());
				
				
				
				
				
				
				
				 
				 
				 
				 
				 
				 
				 
				 
		 
	}

	private static char[] valueOf(String str11) {
		// TODO Auto-generated method stub
		return null;
	}

}
