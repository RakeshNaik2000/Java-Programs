public class Main
{
    void meth1(){
        int i = 500;
        byte b = (byte) i;
        
        System.out.println(i);
        // a = (int)b;
        System.out.println(b);
        float f = 10.1f;
        byte b2 = (byte)f;
        System.out.println(f);
        System.out.println(b2);
       
    }
    
	public static void main(String[] args) {
		Main ob = new Main();
		ob.meth1();
		
	}

}
