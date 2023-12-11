// Sum of power of digits.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int input1 = sc.nextInt();
		
		int []input2 = new int[input1]; 
		for(int i=0;i<input1;i++){
		     input2[i] = sc.nextInt();
		}
		int c=1,num=0;;
		for(int i=0;i<input1-2;i++){
		    if(input2[i]>=input2[i+1]){
		        c+=1;
		        continue;
		    }
		    else{
		        if(c>1){
		            a.add(c);
		            c=1;
		            num+=1;
		        }
		    }
		}
		// num = number of non-ascending sequences.
		// a = arraylist consists of size of each decreasing subsequence.
		if(a.size()==0){
		    System.out.println(0+" "+0);
		}
		else{
		    System.out.println(num+" "+Collections.max(a));
		}
		
	}
}


// INTPUT:
// input1 = 12
// input2 = 2 4 6 1 8 25 18 16 12 19 21 23.
// OUTPUT:
// output1 = num = 2
// output2 = max(a) = 4.
  
