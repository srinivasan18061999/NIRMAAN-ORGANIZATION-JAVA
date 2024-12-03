package day6;

public class CalculatorParameter 
{
void addition(int a,int b,int c)
{
	
	System.out.println("Toatal ="+(a+b+c));
}
void subraction(int a,int b) {
	System.out.println("Total="+(a-b));
}
public static void main(String[] args) {
	int firstNum =100;
	int secondNum =200;
	int dod=10;
	CalculatorParameter para = new CalculatorParameter();
	para.addition(firstNum, secondNum,dod);
	para.addition(500, 500,dod);
	para.subraction(60, 50);
	
}

	
	

}
