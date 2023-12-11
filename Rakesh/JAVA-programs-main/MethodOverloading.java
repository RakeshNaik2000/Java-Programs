import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		// method overloading
	    sum(10,20);
	    sum(10,20,30);
	    sum(10.05,11.3);
	}
	public static void sum(int a,int b){
	    System.out.println(a+b);
	}
	public static void sum(int a,int b,int c){
	    System.out.println(a+b+c);
	}
	public static void sum(double a,double b){
	    System.out.println(a+b);
	}
	
}
