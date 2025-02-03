package InnerClass;

import java.util.ArrayList;

public class MojeVlaknoMain {
    public static void main(String[] args) throws InterruptedException {
        //Runnable v1 = new MojeVlakno();
        //Thread tr1 = new Thread(v1);
        ArrayList<Integer> list = new ArrayList<>();

        Runnable v2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 'a'; i<='z'; i++)
                    list.add(i);
                }
            };
        Thread tr2 = new Thread(v2);

        Thread tr3 = new Thread(() -> {for (int i = -1; i > -100; i--) {list.add(i);}});

        //tr1.start();
        tr2.start();
        tr3.start();
        tr2.join();
        tr3.join();
        System.out.println(list);
    }
}
