import java.util.Scanner;

public class XYZStudent {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
	//	Student ss=new SchoolStudent();
	    Student ss1=new Student();
		Student s1[]=new Student[size];
		for(int i=0;i<s1.length;i++)
		{
	        if(i<2)
	        {
	        	 s1[i]=new CollegeStudent();
	        	s1[i].accept();
	        }
	        else 
	        {
	        	s1[i]=new SchoolStudent();
	        	s1[i].accept();
	        }
    	}
		for(int i=0;i<s1.length;i++)
		{
			s1[i].show();
		}
		System.out.println("Enter the RollNo:=");
		  int roll=s.nextInt();
		  int res=0;
		for(int i=0;i<s1.length;i++)
		{
			 if(s1[i].rollno==roll)
			  {
				  s1[i].show();
				  res=i;
				  
			  }
			
		}
		if(s1[res] instanceof SchoolStudent)
		{
		 System.out.println("school");
		}
		else
		{
			System.out.println("college");
		}
		
		
       ss1.count(s1);
       
 
}
}