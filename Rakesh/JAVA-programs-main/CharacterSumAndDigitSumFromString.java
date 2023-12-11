import java.util.Scanner;
class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        int input2 = sc.nextInt();
        int res=0;
        String Sres = "";
        int isAlpha = 0;
        int isNumeric = 0;
        for(int i=0;i<input1.length();i++){
            if(input1.charAt(i)>='a'&& input1.charAt(i)<='z'||input1.charAt(i)>='A'&& input1.charAt(i)<='Z'){
                // do nothing
            }
            else{
                isAlpha=1;
                break;
            }
        }
        
        for(int i=0;i<input1.length();i++){
            if(input1.charAt(i)>='1'&& input1.charAt(i)<='9'){
                // do nothing
            }
            else{
                isNumeric=1;
                break;
            }
        }
        if((isNumeric==0 && input2==1) || (isAlpha==0 && input2==0)){
            System.out.println("ZERO");
        }
        else if(input1.length()==0 && input2==1){
            System.out.println("NULL");
        }
        else{
            if(input2==0){
                System.out.println("input2==0");
                for(int i=0;i<input1.length();i++){
                    if(input1.charAt(i)>='0' && input1.charAt(i)<='9'){
                        //System.out.println(input1.charAt(i));
                        int x = input1.charAt(i)-'0';
                        res+=x;
                    }
                    
                } 
                System.out.println(res);
            }
            
            if(input2==1){
                for(int i=0;i<input1.length();i++){
                    if(input1.charAt(i)>='a' && input1.charAt(i)<='z'||(input1.charAt(i)>='A' && input1.charAt(i)<='Z'))
                    Sres+=input1.charAt(i);
                } 
                System.out.println(Sres);
            }
            
        }
    }
    
}
