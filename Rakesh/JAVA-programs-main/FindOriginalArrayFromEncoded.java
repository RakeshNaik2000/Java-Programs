import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input2 = sc.nextInt();
        
        int input1[] = new int[input2];
        
        for(int i=0;i<input2;i++){
            input1[i]=sc.nextInt();
        }
        
        int original[] = new int[input2];
        
        original[input2-1] = input1[input2-1];
        
        // creating original array.
        for(int i=input2-2;i>=0;i--){
            int x = input1[i]-original[i+1];
            original[i] = x;
        }
        
        // finding sum of all elements in original array.
        int sum=0;
        for(int i=0;i<input2;i++){
            sum+=original[i];
        }
        // first element in original array.
        int FirstElementInOriginal = original[0];
        
        // printing two ouputs here..
        System.out.println(FirstElementInOriginal+"   "+sum);
        
        
    }
}

Testcase:
input1: 7 6 8 16 12 3
input2: 6
 
output1: 2 (first index value from original array).
output2: 27 (Sum of all elements in original array).
