package day9;

public class Car {
	String make;
	int year;
	
	Car(){
		make="unknown";
		year=2000;
	}
	Car(String make){
		this.make=make;

		year=2034;
		
	}
	Car(String make,int year){
		this.make=make;
		this.year=year;
		
	}
 

}
