//change
//one more change
import java.util.*;
public class Armstrong
{
	int countDig(int n)    
	{
		int count = 0;  
		while(n != 0)  
		{  
			n = n / 10;   
			count = count + 1;  
		}  
		return count;  
	}

	int power(int rem, int dig)
	{
		int result = 1;
		for(int i = 0; i < dig; i++)
		{	
			result = result * rem;
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits:");
		int rem=1, sum=0;
		int n = sc.nextInt();
		Armstrong obj = new Armstrong();
       		int dig = obj.countDig(n);
		int temp = n;
		while(n!=0)
		{
			rem = n % 10;
			sum =sum + (obj.power(rem, dig));
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println("given number is armstrong number.");
		}
		else
		{
			System.out.println("given number is not armstrong number.");			
		}
	}
}
		