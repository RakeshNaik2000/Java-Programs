import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		// Anagram Program
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		String str2 = sc.next();
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		for(int i=0;i<arr1.length;i++){
		    for(int j=0;j<arr2.length;j++){
		        if(arr1[i]==arr2[j]){
		            arr1[i]='@';
		            arr2[j]='@';
		            break;
		        }
		    }
		}
		boolean ans=true;
		for(int i=0;i<arr1.length;i++){
		    if(arr1[i]!=arr2[i]){
		        ans=false;
		        break;
		    }
		}
		if(ans){
		    System.out.println("Anagram");
		}
		else{
		    System.out.println("Not anagram");
		}
		
	}
}
