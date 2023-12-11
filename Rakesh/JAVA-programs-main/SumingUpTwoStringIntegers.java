import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		String res = "";
		int x=0,y=0;
		int sum =0,carry=0;
		for(int i=num1.length()-1,j=num2.length()-1;i>=0 || j>=0;i--,j--){
		    x = i>=0 ? num1.charAt(i)-'0':0;
		    y = j>=0 ? num2.charAt(j)-'0':0;
		    
		    sum = x+y+carry;
		    
		    carry = sum/10;
		    
		    res+=sum%10;
		}
		
		if(carry!=0){
		    res+=carry;
		}
		String result = "";
		for(int i=res.length()-1;i>=0;i--){
		    result+=res.charAt(i);
		}
		System.out.println(result);
		
	}
}

// Without using BigInteger in java.
