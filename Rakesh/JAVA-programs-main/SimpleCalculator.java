import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		int opt;
		while(true){
		    System.out.println("1.Add 2.Subtract 3.Multiply 4.Division 5.Remainder 6.Try with other numbers 7.exit");
		    opt = sc.nextInt();
		    if(opt==7){
		        break;
		    }
		    else if(opt==1){
		        System.out.println(a+b);
		    }
		    else if(opt == 2){
		        System.out.println(a-b);
		    }
		    else if(opt == 3){
		        System.out.println(a*b);
		    }
		    else if(opt == 4){
		        try{
		        System.out.println(a/b);
		        }
		        catch(Exception e){
		            System.out.println("Number is not divisible by zero");
		        }
		    }
		    else if(opt ==5){
		        try{
		        System.out.println(a%b);
		        }
		        catch(Exception e){
		            System.out.println("Number is not divisible by zero");
		        }
		    }
		    else if(opt == 6){
		        System.out.println("enter two numbers:");
		        a = sc.nextInt();
		        b = sc.nextInt();
		        System.out.println("which operation should need to perform");
		    }
		    else{
		        System.out.println("INVALID OPERATOR");
		    }
		    
		}
	}
}
