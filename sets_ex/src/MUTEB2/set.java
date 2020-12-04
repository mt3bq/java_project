package MUTEB2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class set {
   public  set(){
       Set<String> backend=new HashSet<>(Arrays.asList("c#","php","js"));
       Set<String> frotend=new HashSet<>(Arrays.asList("html","css","js"));
       Set<String> mt=new HashSet<>(backend);
       mt.retainAll(frotend);
       mt.add("Kiled");
       mt.removeAll()






       for (String i:mt){
           System.out.println(i);
       }
   }

}
