package day16;

public class Bird implements IAnimal
{
public void move()
{
	System.out.println("The birds flies in the sky");
	
}

public void speak()
{
	System.out.println("The bird says:Chirp Chirp!");
	
}

public static void main(String args[])
{
	Bird b=new Bird();
	b.move();
    b.speak();
    
    
    
    Dog d=new Dog();
    d.speak();
    d.move();
    

    
 System.out.println(IAnimal.isMammal("Bird"));   
 System.out.println(IAnimal.isMammal("Dog"));  




}



}
