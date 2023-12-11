import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // converting n to String
        
        String s = ""+n;
        
        int f = 0;
        
        int l = s.length()-1;
        char a;
        int fg=0;
        while(f<l){
            if(s.charAt(f)==s.charAt(l)){
                // do nothing
            }
            else{
                int k = l-1;
                if(s.charAt(f)==s.charAt(k)){
                    fg=1;
                    a = s.charAt(l);
                    System.out.println(a);
                    break;
                }
                int m = f+1;
                if(s.charAt(m)==s.charAt(l)){
                    fg=1;
                    a = s.charAt(f);
                    System.out.println(a);
                    break;
                }
            }
            f++;
            l--;
            
        }
        if(fg==0){
            System.out.println(-1);
        }
        
    }
}

// Testcases:
// case-1:
// input: 12332
// output: 1
  
// case-2:
// input: 251532
// output: 3
  
// case-3:
// input: 10001
// output: -1

// case-4:
// input: 981894
// output: 4
 
