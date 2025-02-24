package InnerClass;

import lombok.Data;

import java.util.Iterator;

@Data
public  class Trojice implements Iterable<String>{
    String a;
    String b;
    String c;

    class InterniIterator implements Iterator<String> {
        int pocet;

        public boolean hasNext(){
            return pocet < 3;
        }

        public String next(){
            switch (pocet++){
                case 0: return a;
                case 1: return b;
                default: return c;
            }
        }
    }


    public Trojice(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public IteratorTrojice iterator(){
        IteratorTrojice it = new IteratorTrojice();
        it.trojice = this;
        return it;
    }


    public static void main(String[] args) {
        Trojice t = new Trojice("po", "ut", "ne");

        for(String s:t) for(String s2:t) System.out.println(s+s2);

       // IteratorTrojice it = t.dejMiIterator();
       // IteratorTrojice it2 = t.dejMiIterator();

       // while(it.hasNext()){
       //     System.out.println(it.next());
       // }

       // while(it2.hasNext()){
       //     System.out.println(it2.next());
       // }
    }
}
