package MUTEB2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;

public class Main {

    public static void main(String[] args) {
       try{PrintWriter out=new PrintWriter("Namee.txt");
           String[] name={"Muteb","Kiled"};

           for (int index=0;index< name.length;index++){
               out.println(name[index]);
           }
           out.close();}catch (Exception ex){

           System.out.println("fILED");
       };

    }

    }
