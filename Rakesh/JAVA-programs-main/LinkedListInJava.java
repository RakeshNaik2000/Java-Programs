import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String name = sc.next();
            ll.add(name);
        }
        System.out.println("Enter the names present in the linked list:");
        for(String x: ll){
            System.out.println(x);
        }
        
        System.out.println("the last element in the list is:"+ll.getLast());
        // creating arraylist and converting it into LinkedList
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        
        
        LinkedList<Integer> al = new LinkedList<>(arr);
        System.out.println("the elements present in Linked list:");
        
        for(Integer x: al){
            System.out.println(x);
        }
        
    }
}
