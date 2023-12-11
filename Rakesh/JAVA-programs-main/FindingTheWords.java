import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next().toLowerCase();
		String input2[] = sc.next().toLowerCase().split(":");
		String res="";
		
		for(int i=0;i<input2.length;i++){
		    int flag=0;
		    for(int j=0;j<input1.length();j++){
		        if(input1.charAt(j)=='_'){
		            continue;
		        }
		        else if(input2[i].charAt(j)!=input1.charAt(j)){
		            //System.out.println(input2[i].charAt(j)!=input1.charAt(j));
		            flag=1;
		            break;
		        }
		        else{
		            System.out.println("true");
		        }
		    }
		    if(flag==0){
		        res+=input2[i].toUpperCase()+":";
		    }
		}
		if(res.length()==0){
		    System.out.println("ERROR-009");
		}
		else{
		    System.out.println(res.substring(0,res.length()-1));
		}
		
	}
}

/*
Example:
input: Fi_er
       Fibre:Filer:fiber:fixer:fimer:filter
output: FILER:FIBER:FIXER:FIMER
*/
