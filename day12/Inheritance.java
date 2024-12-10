package day12;


class Animal
{
	void sound()
	{
		System.out.println("This animal makes a sounds");
	}

}
class Dog extends Animal
{
	@Override
	
	void sound()
	{
		System.out.println("The dog barks");
	}
	
}
	class Cat extends Animal
	{
		@Override
		
		void sound()
		{
			System.out.println("The cat meows");
		}
	}
	
	public class Inheritance
	{
	
	public static void main(String[]args)
	{
	Dog D=new Dog();
	D.sound();
	Cat C=new Cat();
	C.sound();
    }
	
	}
	
	 

