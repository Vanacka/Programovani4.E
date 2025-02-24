package Anotace;

import java.lang.reflect.Method;

public class JmenoAutora {
    public static void main(String[] args) {
        MojeTrida cauPeto = new MojeTrida();

        Class<?> cl = cauPeto.getClass();

        Autor autor = cl.getAnnotation(Autor.class);

        if (autor != null) {
            System.out.println(autor.jmeno());
        }

        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        JardaJagr jagr = new JardaJagr();

        Class<?> cls = jagr.getClass();

        Autor kunda = cls.getAnnotation(Autor.class);

        if (kunda != null) {
            System.out.println(kunda.jmeno());
        }

        Method[] methoda = cls.getMethods();
        for (Method method : methoda) {
            System.out.println(method.getName());
        }
    }
}/*

*/