
public class TestString {

	public static void main(String[] args) {
		/*String str = "Hi";
		System.out.println("str=="+str);
		str = "Bye";
		System.out.println("str1=="+str);
		
		StringBuffer sb = new StringBuffer("Hiii");
		sb.append("Byeee");
		System.out.println("sb=="+sb);*/
		
		String str = "test";
		String str1 = new String("test");
		String str2 = "test";
		String str3 = str2;
		String str4 = new String("test");
		System.out.println("Equals="+str.equals(str1));
		System.out.println("=="+(str==str1));
		System.out.println("str.eq(str2)=="+str.equals(str2));
		System.out.println("(str==str2)=="+(str==str2));
		System.out.println("(str3==str2)="+(str3==str2));
		System.out.println("str4==str="+(str4==str));
		
		
		System.out.println(str3.hashCode());
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
	}
}