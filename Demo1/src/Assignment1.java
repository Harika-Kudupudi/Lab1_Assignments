
/**
 * Display String in reverse order word by word
 * @author Harika
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {
		String[] a= input.split(" ");
		int n=a.length;
		String b="";
		for(int i=n-1;i>=0;i--) {
			b+=a[i]+" ";
		}
		return b;
	}

}