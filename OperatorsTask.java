package day1;

public class OperatorsTask 
{

	public static void main(String[] args) 
	{
		int firstNum=12;
		int secondNum=25;
        
		int addition=firstNum + secondNum;
        int subtraction=firstNum - secondNum;
        int multiplication=firstNum * secondNum;
        int division=firstNum * secondNum;
        int modulus=firstNum % secondNum;
        
        
		
        System.out.println("Arithmetic Operations:");
		System.out.println("Subtracion:"+subtraction);
		System.out.println("Multiplication:"+multiplication);
		System.out.println("Division:"+division);
		System.out.println("Modulus:"+modulus); 
		
		System.out.println();
		int thirdNum=12;
		int fourthNum=25;
		
	
		System.out.println("Reational Operations:");
		System.out.println("12>25:"+(thirdNum>fourthNum));
		System.out.println("12<25:"+(thirdNum<fourthNum));
		System.out.println("12>=25:"+(thirdNum>=fourthNum));
		System.out.println("12<=25:"+(thirdNum<=fourthNum));
		System.out.println("12==25:"+(thirdNum==fourthNum));
		System.out.println("12!=25:"+(thirdNum!=fourthNum));
	}
		
	}


