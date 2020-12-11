package MUTEB2;

public class Main {

    public static void main(String[] args) {
	int res=s.add(12,12);
	System.out.println(res);
        int res1=s.sub(12,12);
        System.out.println(res1);
        int res2=s.mul(12,12);
        System.out.println(res2);
        int res3=s.div(12,0);
        System.out.println(res3);

        s tt=new s();
        s tt1=new s();
        s tt2=new s();
        tt.think();
        System.out.println(s.count);
    }
}
