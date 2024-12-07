package day9;

public class car1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car in =new Car();
        System.out.println(in.make);
        System.out.println(in.year);
        System.out.println("");
        
        
        Car in1=new Car("tata" );
        System.out.println(in1.make);
        System.out.println(in1.year);
        System.out.println("");
        
        Car in2=new Car("bmw",3045);
        System.out.println(in2.make);
        System.out.println(in2.year);
        
       
	}

}
