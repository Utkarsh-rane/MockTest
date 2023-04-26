import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st string");
	String str1=sc.nextLine();
	System.out.println("enter 2nd string");
	String str2=sc.nextLine();
	char[] arr1=str1.toCharArray();
	char[] arr2=str2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	System.out.println(arr1);
	System.out.println(arr2);

	if(Arrays.equals(arr1, arr2))
	{
		System.out.println("given strings are Anagram");
	}
	else
	{
		
		System.out.println("given strings are not Anagram");
	}
}
}