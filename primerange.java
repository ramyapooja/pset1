import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int c=0,k=0,i,j,a;
		for(i=m;i<=n;i++)
		{
			a=0;
			for(j=2;j<i;j++)
			{
				if((i%j)==0)
				{
					++a;
				}
			}
			if(a==0)
			{
				
					c++;
			}
		}
		System.out.println(c);
	}
}
