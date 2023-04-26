

import java.util.Scanner;

public class SecondOccurence {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter string here:");
    	String s=sc.nextLine();
    	int counter=0,d=0,i=0;
    	
    	System.out.println("enter char to find:");
    	char ch=sc.next().charAt(0);
    	sc.close();
    	char[] arr=s.toCharArray();
    	for( i=arr.length-1;i>0;i--)
    	{
    		if(arr[i]==ch)
    		{
    			counter++;
    			if(counter==2)
    			{
    				d++;
    				break;
    			}
    		}
    	}
    	if(d==1)
    	{
    		System.out.println(i);
    	}
    	else if(counter==1)
    	{
    		System.out.println("No two occurance");
    	}
    	else
    	{
    		System.out.println("char not present");
    	}
    	
    }
}