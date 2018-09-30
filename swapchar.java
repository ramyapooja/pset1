/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[]=s.toCharArray();
		char temp;
		for(int i=0;i<c.length;i=i+2)
		{
			temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	}
}
