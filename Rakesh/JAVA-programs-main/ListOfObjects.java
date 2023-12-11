import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class Student{
    private int id;
    private String name,address;
    public Student(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    private int getId(){
        return id;
    }
    public String getAddress(){
        return address;
    }
    public void showData(){
        System.out.println("Name:"+name+"\nID:"+getId()+" Address:"+getAddress());
    }
    
    
}
public class Main
{  
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Student> student = new ArrayList<>();
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++){
	        System.out.println("Enter your id:");
	        int id = sc.nextInt();
	        System.out.println("Enter your name:");
	        String name = sc.next();
	        System.out.println("enter your address:");
	        String address = sc.next();
	        student.add(new Student(id,name,address));
	    }
	    
	    System.out.println("The data stored in the arraylist is:");
	    
	    for(Student ptr : student){
	       // System.out.println(ptr.showData());
	       ptr.showData();
	    }
	    
	   // Student s1 = new Student(1,"charan","warangal");
	   // s1.showData();
		//System.out.println("Hello World");
	}
}
