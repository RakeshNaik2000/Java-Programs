
using System;
class HelloWorld {
  static void Main() {
    string input1 = Console.ReadLine().ToLower();
    string part1="",part2="",part3="";
    string z = "";
    if(input1.EndsWith(".com")){
        part3 = ".com";
        if(input1.Contains("@gmail")){
            part2 = "@gmail";
        }
        else if(input1.Contains("@yahoo")){
            part2 = "@yahoo";
        }
        else if(input1.Contains("@wipro")){
            part2 = "@wipro";
        }
        int ind = input1.IndexOf('@');
        int flag=0;
        for(int i=0;i<ind;i++){
            if(input1[i]>='a' && input1[i]<='z' || input1[i]>='0' && input1[i]<='9'){
                z+=input1[i];
            }
            else{
                z+=input1[i];
                flag=1;
            }
        }
        part1 = z;
        
        if(flag==0 && part1.Length<15){
            Console.WriteLine(part1+":"+part3+":"+"valid");
        }
        else{
            Console.WriteLine(part1+":"+part2+":"+"invalid");
        }
    }
    else{
        if(input1.Contains("@gmail")){
            part2 = "@gmail";
        }
        else if(input1.Contains("@yahoo")){
            part2 = "@yahoo";
        }
        else if(input1.Contains("@wipro")){
            part2 = "@wipro";
        }
        int ind = input1.IndexOf('@');
        int flag=0;
        for(int i=0;i<ind;i++){
            if(input1[i]>='a' && input1[i]<='z' || input1[i]>='0' && input1[i]<='9'){
                z+=input1[i];
            }
            else{
                z+=input1[i];
                flag=1;
            }
        }
        part1 = z;
        
        if(flag==0){
            Console.WriteLine(part1);
            Console.WriteLine(part1+":"+part3+":"+"valid");
        }
        else{
            Console.WriteLine(part1+":"+part2+":"+"invalid");
        }
    }
  }
}

/*OUTPUT:
  TESTCASE-1:
  input1: rahul123@wipro.com
  output1: rahul123:.com:valid

  TESTCASE-2:
  input1: abhinavgovindha12345@yahoo.com
  output: abhinavgovindha12345:@yahoo:invalid

  TESTCASE-3:
  input1: rahul$123@wipro.com
  output: rahul$123:@wipro:invalid */
