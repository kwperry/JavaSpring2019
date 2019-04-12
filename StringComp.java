
public class StringComp {

	public static void main(String[] args) {
		
		//don't do this ever
		String str1, str2;
		str1 = str2 = new String("abc");
		
		
		//String str1 = new String("abc");
		//String str2 = new String("abc");
		String str3 = "abc", str4 = "abc";
		
		if(str1 == str2)
		{
			System.out.println("str1 == str2");
		}
		
		if(str3 == str4)
		{
			System.out.println("str3 == str4");
		}
		
		if(str1.contentEquals(str2))
		{
			System.out.println("str1 equals str2");
		}
		
		

	}

}
