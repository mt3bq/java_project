package MUTEB2;

import java.util.ArrayList;
import java.util.List;

public class list {
    public list(){
        List<String>name=new ArrayList<>();
        name.add("Kiled");
        name.add("All");
        name.add("Muteb");
        System.out.println(name.indexOf("All"));
        System.out.println(name.get(1));

        for (String i:name){
            System.out.println(i);
        }
    }


}
/*import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StoreInventory {
    Set<String> superCycleSet = new TreeSet<>();
    List<String> myStoreList = new ArrayList<>();

    public StoreInventory() {
        myStoreList.add("Bicycle");
        myStoreList.add("Tricycle");
        myStoreList.add("Scooter");
    }

    public void printStoreInventory() {
        myStoreList.forEach(i -> System.out.println("My Store item: " + i));
    }

    public void collectCycleItems() {
        // Task 1
        myStoreList.forEach(i-> {
            if (i.contains("cycle"))
                superCycleSet.add(i);
        });

        // Task 2
        superCycleSet.forEach(i -> System.out.println("Super Cycle item: " + i));
    }
}*/

/*import java.util.Map;
import java.util.TreeMap;

public class FruitStand {
    private Map<String, Integer> prices = new TreeMap<>();

    public FruitStand(){
        prices.put("Apple", 1);
        prices.put("Avocado", 2);
        prices.put("Banana", 1);
        prices.put("Mango", 2);
        prices.put("Starfruit", 4);
    }

    public void printPrices() {
        prices.forEach((key, value) -> System.out.println("Fruit: " + key + ", $" + value));
    }
}*/


/*public class MultithreadApp {

    Thread thread1;
    Thread thread2;

    public MultithreadApp() {
        thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Thread #1 is running");
            }
        });

        // Task 1
        thread2 = new Thread(() -> System.out.println("Thread #2 is running"));
    }

    public void startThreads() {
        thread1.start();
        // Task 2
        thread2.start();
    }
}*/
