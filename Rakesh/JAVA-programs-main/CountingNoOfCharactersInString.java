public class Main
{
	public static void main(String[] args) {
	    
		String name = "Charan1234";
		int count =0;
		for(int i=0;i<name.length();i++){
		    // "C".matches([0-9])----> True/False
		    if(String.valueOf(name.charAt(i)).matches("[0-9]")){
		        count++;
		    } 
		}
		System.out.println(count);
		
	}
}
