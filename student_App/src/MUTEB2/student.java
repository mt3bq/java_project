package MUTEB2;
import java.util.Scanner;

public class student {
    public int k;
    public String[] name=new String[10];
    public String[] ba=new String[10];
            //,email,phone,student_id,ba=new String[10];
    Scanner red=new Scanner(System.in);

    public  void  add(){

        do{
            System.out.print("Enter Name:");
           this.name[k]=red.next();
           System.out.print("If you need back Enter[b] or not Enter [c]:");
           this.ba[k]=red.next();
           if(ba[k].equals("b")){
               break;
           }
k++;
        }while(true);


    }


}
