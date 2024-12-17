package day17;

public class WrapperClass
{

public static void main(String[] args)
{
	int num1=10;
	byte num2=1;
	boolean value=true;
	char letters=('d');
	double num3=32.00;
	float num4=5.0f;
	short num5=126;
	
	
	Integer autoBoxingInt=num1;
	System.out.println(autoBoxingInt);
	int unboxingInt=num1;
	System.out.println(unboxingInt);
	
	
	Byte autoBoxingByte=num2;
	System.out.println(autoBoxingByte);
	byte unboxingByte=num2;
	System.out.println(unboxingByte);
	
	
	Boolean autoBoxingBoolean=value;
	System.out.println(autoBoxingBoolean);
	boolean unboxingBoolean=value;
	System.out.println(unboxingBoolean);
	
	
	Character autoBoxingChar=letters;
	System.out.println(autoBoxingChar);
	char unboxingChar=letters;
	System.out.println(unboxingChar);
	
	
	Double autoBoxingDouble=num3;
	System.out.println(autoBoxingDouble);
	double unboxingDouble=num3;
	System.out.println(unboxingDouble);
	
	
	Float autoBoxingFloat=num4;
	System.out.println(autoBoxingFloat);
	float unboxingFloat=num4;
	System.out.println(unboxingFloat);
	
	
	Short autoBoxingShort=num5;
	System.out.println(autoBoxingShort);
	short unboxingShort=num5;
	System.out.println(unboxingShort);
}

}
