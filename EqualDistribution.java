
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =new Scanner(System.in);
	    int testCases =sc.nextInt();
	    
	    for(int i=0;i<testCases ;i++ ) {
	       int alice =sc.nextInt(); 
	       int bob =sc.nextInt();
	       
	       int total = alice+bob;
	       
	       if(total%2==0){
	           System.out.println("YES");
	       }
	       else{
	            System.out.println("NO");
	       }
	    }
	}
}
