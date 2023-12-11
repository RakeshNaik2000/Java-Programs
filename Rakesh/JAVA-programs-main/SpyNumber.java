import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    // SPY NUMBER
		Scanner sc = new Scanner(System.in);
		int start,end;
		int product,sum;
		System.out.println("Enter two numbers:");
		start=sc.nextInt();
		end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
		    product = checkProduct(i);
		    
		    sum = checkSum(i);
		    
		    if(product==sum){
		        System.out.println("SPY NUMBER:"+i);
		        count++;
		    }
		  //  else{
		  //      System.out.println("NOT SPY:"+i);
		  //  }
		}
		System.out.println("count="+count);
		
	}
	public static int checkProduct(int num){
	    int pro=1;
	    while(num!=0){
	        int rem = num%10;
	        pro = pro * rem;
	        num=num/10;
	    }
	    return pro;
	}
	public static int checkSum(int n){
	    int sum=0;
	    while(n!=0){
	        int rem = n%10;
	        sum = sum + rem;
	        n=n/10;
	    }
	    return sum;
	}
}
