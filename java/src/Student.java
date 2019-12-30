import java.util.Scanner;

public class Student {
int rollno,percentage;
protected  	Scanner s=new Scanner(System.in); 
public Student()
{
	rollno=52;
	percentage=78;
}
public Student(int rollno,int percentage)
{
	this.rollno=rollno;
	this.percentage=percentage;
}
public void accept()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the RollNo:=");
	rollno=s.nextInt();
	System.out.println("enter the percentage");
	percentage=s.nextInt();
}
public void count(Student ss1[])
{
	int count=0;
	for(int i=0;i<ss1.length;i++)
	{
		if(ss1[i].percentage>75)
		{
			++count;
		}
	}
	System.out.println("  count of A grade"+count);
}
public void show()
{
	System.out.println("RollNo="+rollno+" percentage :="+percentage);
}
}
