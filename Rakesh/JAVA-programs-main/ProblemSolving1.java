

import java.util.*;
public class Main
{
    public static int func(int input1,int input2,int input3,int input4,int input5,int input6){
        // write code here.
        int a[] = {input1,input2,input3,input4,input5,input6};
       
        Arrays.sort(a);
        
        int max = a[a.length-1];
        
        int evenDigit = 0;
        
        for(int i=0;i<a.length-1;i++){
            int n = a[i];
            while(n!=0){
                int rem = n%10;
                if(rem%2==0){
                    evenDigit+=rem;
                }
                n=n/10;
            }
        }
        
        return max-evenDigit;
    }
	public static void main(String[] args) {
		System.out.println(Main.func(2356,6821,6835,1589,2910,9472));
	}
}

