/**
 * Display String in reverse order word by word
 * @author Harika
 *
 */
public class Assignmnet2 {
	
	public static void main(String[] args) {
		String url1="www.codegram.in/admin/reports/daywiseuser.php";
		String url2="www.codegram.in/guest/registration.php";
		String url3="www.codegram.in/about.php";
		String command=null;
		
		command=showCommand(url1);
		//System.out.println("Command is : "+command );
		
		/**command=showCommand(url2);
		System.out.println("Command is : "+command );
		
		command=showCommand(url3);
		System.out.println("Command is : "+command );*/

	}

	private static String showCommand(String input) {
		String[] a= input.split("/");
		int n=a.length;
		String s=a[n-1];
		String[] b=s.split(".");
		//String q=b[b.length-1];
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		return null;
		
}
}
