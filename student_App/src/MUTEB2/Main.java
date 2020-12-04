package MUTEB2;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
	// write your code here
 int ch;
 Scanner red1=new Scanner(System.in);
 student model1=new student();
        boolean lo=true;
     while (lo==true){

         System.out.print("Entre you choies:");
         ch=red1.nextInt();
         switch (ch){

             case 1:
                 model1.add();
                 break;
             case 0:
                   lo=false;
                 break;
1
         }

     }


    }
}
