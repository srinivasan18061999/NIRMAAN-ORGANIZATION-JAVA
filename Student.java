package day5;

public class Student{ 
 String StudentName="";
int DOB;
String RollNo;
int age;

void start() {
	System.out.println();
	
}


public static void main(String[] args)
{
	
Student Studentdetails=new Student();
Studentdetails.StudentName="srini";
Studentdetails.DOB=18061999;
Studentdetails.age=25;
Studentdetails.RollNo="17g320";
Studentdetails.start();
System.out.println(Studentdetails.StudentName);
System.out.println(Studentdetails.DOB);
System.out.println(Studentdetails.age);
System.out.println(Studentdetails.RollNo);




}

}
