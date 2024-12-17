package day16;

public interface IAnimal 
{

	String LivingBeing="Animals";


static boolean isMammal(String animalname)
{
return	(animalname.equalsIgnoreCase("Dog"))||(animalname.equalsIgnoreCase("Cat"));
}
 
 default void speak()
	{
		System.out.println("Animal is making sound");
	}
public void move();
	
}
