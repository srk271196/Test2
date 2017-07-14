import java.util.*;
class PrimeNos 
{  
	 int prime(int k)
	{
     int[] array=new int[10000];
	   int index=0,sum=0,count3=0,i=0,j=0;
	  // System.out.println("k="+k);
	   for( i=2;i<k;i++)
		{ 
		   count3=0;
		    for( j=1;j<=i;j++)
			{
				if(i%j==0)
					count3++;
				
			}
       if(count3==2)
				{ 
					array[index]=i;
					
					//System.out.println("value="+array[index]);
					if(sum==k)
						break;
					else
					{sum=sum+array[index];
					index++;}
				}
		}
		//System.out.println("Sum is"+sum);
       return sum;
	}
	


	public static void main(String[] args) 
	{   PrimeNos p=new PrimeNos();

		long n;
		int count=0,count2=0,total=0;
		Scanner s=new Scanner(System.in);
	    n=s.nextInt();
		for(int i=5;i<=n;i++)
		{
			 count=0;
			 
				  for(int j=1;j<=i;j++)
				{
					  if(i%j==0)
					{
						  count++;
				    }
					//System.out.println("count="+count);
					  
				}
			if(count==2)
					{
                       total=p.prime(i);
						if(total==i)
						    count2++;
						
					}
		
		}
	System.out.println(count2);
	}
	
}
