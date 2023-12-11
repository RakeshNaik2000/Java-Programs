/*
Given a number N. Question is to find the other number(M) which is greater than N and the sum of the digits should be equal to the sum of digits of N. 
NOTE: The number M should be the least number which carries the equivalent sum of number N.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = Main.solution(n);
		System.out.println(result);
	}
	public static int solution(int n){
	    
	    int a = n;
	    int sum = 0;
	    while(a!=0){
	        int rem = a%10;
	        sum+=rem;
	        a=a/10;
	    }
	    int i = n+1;
	    int flag = 0;
	    for(;;i++){
	        int s =0;
	        int N = i;
	        while(N!=0){
    	        int r = N%10;
    	        s+=r;
    	        N =N/10;
	        }
	        if(sum==s){
	            flag=1;
	            break;
	        }
	    }
	    if(flag==1){
	        return i;
	    }
	    else{
	        return -1;
	    }
	    }
}



/*
Example:
N=28 = sum = 10
next number is : 37 = sum = 10.

N=1990 = 19
M = 2089 = 19.
*/
