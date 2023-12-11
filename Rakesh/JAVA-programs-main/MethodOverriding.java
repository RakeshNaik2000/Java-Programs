class Main{
    public static void main(String args[]){
        Child obj = new Child();
        obj.eating();
    }
}
class Parent{
    public void eating(){
        System.out.println("Father is eating...");
    }
    
}
class Child extends Parent{
    public void eating(){
        System.out.println("Child is eating...");
        super.eating();
    }
}
