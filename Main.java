package sumofoddven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		// TODO Auto-generated method stub1
		System.out.println("Enter any integer");
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		int sum=0;
		int s = 0;
		
		int n= sc.nextInt();
		for(i=1;i<=n;i++)
		{
		if(i%2 == 0)
			{sum=sum+i;}
		else
		{ 
			s=s+i;
			}
		}
		
		
	
		
			
			
			System.out.println(  "Sum of even numbers" +   " = " + sum);
			
			System.out.println( "Sum of odd numbers" +   " = " + s);
			
			
		}	
		}
	



