package day3;
import java.util.Scanner;
public class TwoTables
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int table = sc.nextInt();
		for(int n=1;n<=10;n++)
		{
			System.out.println(table+"*"+n+"="+n*table);
		}
	}
}