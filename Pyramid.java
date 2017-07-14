import java.util.*;
import java.io.*;
class Pyramid 
{
	public static void main(String[] args) 
	{  
       Scanner s=new Scanner(System.in);
	     
		 int n=s.nextInt();
         int a=3,b=2;

	 for(int i=0;i<n;i++)
		{  
		    for(int space=1;space<=n-i;space++)
		             
			          System.out.print(" ");
		   
		   for(int j=0;j<=i;j++)
			{
			    
				int r=(a+4)*(b+2);
                String str=Integer.toString(r);
				 int add=0;
				 String str2="";
				  if(str.length()<5)
				      {
					    add=5-str.length();
				      }
				  if(add==1)
					  str2="0";
				  if(add==2)
					  str2="00";
				  if(add==3)
					  str2="000";
				  if(add==4)
					  str2="0000";
                  
                  System.out.print(" "+str2.concat(str));
                           a=a+4;
			               b=b+2;
         
		    }
			

			System.out.print("\n");
		}

	}
}
