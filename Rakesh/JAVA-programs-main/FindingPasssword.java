import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String fn = sc.next();
        
        String ln = sc.next();
        
        int pin = sc.nextInt();
        
        int n = sc.nextInt();
        
        int fLength = fn.length();
        
        int lLength = ln.length();
        String longName = "",smallName="";
        
        if(fLength>lLength){
            longName=fn;
            smallName=ln;
        }
        else{
            longName=ln;
            smallName=fn;
        }
        
        String userId="";
        userId = smallName.charAt(smallName.length()-1)+longName;
        
        // left to right.
        String newPin = String.valueOf(pin);
        for(int i=0;i<newPin.length();i++){
            if(i==n-1){
                userId+=newPin.charAt(i);
            }
        }
        // right to left
        for(int i=newPin.length()-1;i>=0;i--){
            if(i==newPin.length()-n){
                userId+=newPin.charAt(i);
            }
        }
        
        // toggle code.
        String res="";
        for(int i=0;i<userId.length();i++){
            if(userId.charAt(i)>='a' && userId.charAt(i)<='z'){
                int x = userId.charAt(i)-32;
                res+=(char)x;
            }
            else if(userId.charAt(i)>='A' && userId.charAt(i)<='Z'){
                int x = userId.charAt(i)+32;
                res+=(char)x;
            }
            else{
                res+=userId.charAt(i);
            }
        }
        
        System.out.println(res);
        
    }
}
