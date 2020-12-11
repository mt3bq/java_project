package MUTEB2;

public class s {
    public  static  int count;
public s(){
count++;
}

    public static int add(int x, int y) {

        return x + y;
    }

    public static int sub(int x, int y) {

        return x - y;
    }

    public static int mul(int x, int y) {

        return x * y;
    }

    public static int div(int x, int y) {
        if (y == 0)
            return 0;

        return x / y;


    }
    public void think(){
    System.out.println("Thank tou for using Program...");
    }
}
