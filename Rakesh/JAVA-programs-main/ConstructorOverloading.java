class Main
{
    String name,rollno;
    Main(String name,String rollno){
            this.name=name;
            this.rollno=rollno;
        }
    Main(String name){
        this.name=name;
    }
    public void show(){
        System.out.println("name:"+name+" roll_no:"+rollno);
    }
    public static void main(String args[]){
        Main obj = new Main("geethika","18071A0577");
        Main obj2 = new Main("priya");
        obj.show();
        obj2.show();
    }
}
// Main.main();
