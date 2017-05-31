import java.util.*;
public class Solution {
    public ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
         int primes[] = new int[a+1];
         int isSum,flag=1;
	   ArrayList<Integer> primeList = new ArrayList<Integer>();
	  int i,j,n;
	  
	    for(i=0;i<=a;i++)
{
primes[i]=1;
}
primes[0]=0;
primes[1]=0;

for(i=2;i<=(int)Math.sqrt(a);i++)
	{
	if(primes[i]==1)
	{
	for(j=2;j*i<=a;j++)
	
		{
		primes[i*j]=0;
		}
	}	
	}
	
for(i=0;i<=a;i++)
{
if(primes[i]==1)
{
primeList.add(i);

}
}	
	    for (i=0;i<primeList.size();i++)
	        {
	            if(flag==1)
	            {
	            for(j=0;j<primeList.size();j++)
	            {
	                isSum=primeList.get(i)+ primeList.get(j);
	                if (isSum== a)
	                {
	                    sum.add(primeList.get(i));
	                    sum.add(primeList.get(j));
	                    flag=0;
	                }
	            }
	        }
	            
	        }
	  
        return sum;
        
    }
}
