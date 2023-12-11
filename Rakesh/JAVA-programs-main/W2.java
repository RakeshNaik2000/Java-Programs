/* 

Given a string s of n lowercase english letters, returns a stringg with no instances of three identical consecutive letters, obtained from s by deleting the minimum possible number of letters.
*/



import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    System.out.println(Main.solution(str));
	}
	
	public static String solution(String s){
	    String res = "";
	    int count=1;
	    char[] arr = s.toCharArray();
	    for(int i=0;i<arr.length-1;i++){
	        if(arr[i]==arr[i+1]){
	            count++;
	        }
	        else{
	            count=1;
	        }
	        
	        if(count>2){
	            arr[i-1]='@';
	        }
	    }
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!='@'){
	            res+=arr[i];
	        }
	        
	    }
	    return res;
	}
}

/*
OUTPUT:
s = "eedaaad" -----> = "eedaad"
s = "uuuuxaaaaxuuu" ------> = "uuxaaxuu"
*/
