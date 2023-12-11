import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
// 		System.out.println("Hello World");
        int n = sc.nextInt();
        System.out.println(Main.solution(n));
	}
	public static int solution(int A){
	    char []B = String.valueOf(A).toCharArray();
	    
	    int mx = A;
	    int six=0,nine=0;
	    //String x = String.valueOf(A);
	    for(int i=0;i<B.length;i++){
	        if(B[i]=='6'){
	            B[i]='9';
	            six=1;
	            String x = new String(B);
	            int y = Integer.parseInt(x);
	            //System.out.println("y"+y);
	            if(mx<y){
	                mx = y;
	            }
	        }
	        else if(B[i]=='9'){
	            B[i]='6';
	            nine=1;
	            String x = new String(B);
	            int y = Integer.parseInt(x);
	            System.out.println("y"+y);
	            if(mx<y){
	                mx = y;
	            }
	        }
	        else{
	            // do nothing!!
	        }
	        if(nine==1){
	            B[i]='9';
	            nine=0;
	        }
	            
	        if(six==1){
	            B[i]='6';
	            six=0;
	        }
	    }
	    return mx;
	}
}


// Example:
// 669 -----> 969,696,666----> max = 969.
