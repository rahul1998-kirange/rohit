
public class CollegeStudent extends Student {
  int semester;
  public CollegeStudent()
  {
	  semester=8;
  }
  public CollegeStudent(int semester)
  {
	  this.semester=semester;
  }
  public void accept()
  {
	  super.accept();
	  System.out.println("enter the no of semester");
	  semester=s.nextInt();
  }
  public void show()
  {
	  super.show();
  	System.out.println("semester="+semester);
  }
}
