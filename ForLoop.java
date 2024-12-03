package day6;

public class ForLoop 
{
public static void main(String[] agrs)
{
	for(int i=1;i<=10;i++)
	{
		if(i==5) 
		{
			System.out.println(i);
		continue;
		}
		else if(i==6)
		{
			break;
		
		}
		else
		{
			System.out.println(i);
		}
	}
}
}
