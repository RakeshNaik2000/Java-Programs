public class Main
{
    void Implicit(){
        byte b = 10;
        System.out.println("bv:"+b);
        short s = b;
        System.out.println("sv:"+s);
        s++;
        int i=s++;
        System.out.println("iv:"+i);
        System.out.println("sv:"+s);
        long l = i;
        System.out.println("lv:"+(--l));
        float f = l;
        System.out.println("fv:"+(f+b));
        double d = (--f);
        System.out.println("dv:"+d);
        show();
        if(!(d==f)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        
    }
	public static void main(String[] args) {
		Main ob = new Main();
		ob.Implicit();
		
	}
	static void show(){
	    char c ='A';
	    int a = ++c;
	    System.out.println(a);
	    Main ob = new Main();
	    String S = ob.meth1();
	    System.out.println(S);
	}
	String meth1(){
	    String s = "My name is charan";
	    return s;
	}
}
