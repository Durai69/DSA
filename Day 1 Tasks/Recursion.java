package addon;

public class Recursion  {
	
	public static int name(int num) {
		
		if (num==0) {
			return 0;
			
		}
		return num+name(num-1);
		
	}
	public static void main (String[]args) {
		System.out.println(name(10));
	}
	
}
