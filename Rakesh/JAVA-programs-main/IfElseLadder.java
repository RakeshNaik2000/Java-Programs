import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	n = sc.nextInt();
	if(n==0){
	    System.out.println("one");
	}
	else if(n==1){
	    System.out.println("two");
	}
	else if(n==2){
	    System.out.println("three");
	}
	else if(n==4){
	    System.out.println("four");
	}
	else if(n==5){
	    System.out.println("five");
	}
	else if(n==6){
	    System.out.println("six");
	}
	else if(n==7){
	    System.out.println("seven");
	}
	else{
	    System.out.println("the number is not present");
	}
	System.out.println("I am out from If else");
	}
}
