import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		while(true)
		{
		System.out.println(" please enter the string  to be reversed");
		
           Scanner sc = new Scanner(System.in);
           String s = sc.next();
           System.out.println(" reversed string is");
	        for (int i =s.length()-1; i >= 0; i--) {   
	        	  
	               System.out.print(s.charAt(i));    
	        }
	        System.out.println("   ");
		}
	}

}
