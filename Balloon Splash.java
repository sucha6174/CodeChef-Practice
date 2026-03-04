import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if(X > Y){
		    System.out.print("Alice");
		}
		else if(X < Y){
		    System.out.print("Bob");
		}
		else{
		    System.out.print("Draw");
		}

	}
}
