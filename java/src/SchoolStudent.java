
public class SchoolStudent extends Student{
  int className;
  public SchoolStudent()
  {
	  className=12;
  }
  public SchoolStudent(int className)
  {
	  this.className=className;
  }
  public void accept()
  {
	  super.accept();
	  System.out.println("enter the classname");
	  className=s.nextInt();
  }
  public void search(Student s1[])
  {
	  System.out.println("Enter the RollNo:=");
	  int roll=s.nextInt();
	  for(int i=0;i<s1.length;i++)
	  {
		  if(s1[i].rollno==roll)
		  {
			  s1[i].show();
		  }
	  }
  }
  public void show()
  {
	  super.show();
  	System.out.println("className="+className);
  }
}
