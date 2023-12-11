public class Main
{
    void display(){
        byte x;
        int a = 270;
        double b = 129.728;
        x = (byte) a;
        System.out.println("a and x:"+a+" "+x);
        a = (int)b;
        System.out.println("b and a:"+b+" "+a);
        x = (byte)b;
        System.out.println("b and x:"+b+" "+x);
        
    }
    
	public static void main(String[] args) {
		Main ob = new Main();
		ob.display();
		
	}

}
