package Anotace;

import javax.print.MultiDocPrintJob;
import java.beans.JavaBean;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Autor(jmeno = "Pééééééééťťťťaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
@Deprecated
@JavaBean
public class MojeTrida {

    @Zpracuj
    public void metoda1() {
        System.out.println("Zpracovavam Metoda1");
    }

    @Zpracuj()
    public void metoda2() {
        System.out.println("Zpracovavam Metoda2");
    }

    public void metoda3() {
        System.out.println("Metoda 3 není označena anotací");
    }

    public static void main(String[] args) {
        MojeTrida mojeTrida = new MojeTrida();

        Class<?> cl = mojeTrida.getClass();

        Annotation a = cl.getAnnotation(Autor.class);
        if (a != null) {
            System.out.println(a);
        }

        for(Annotation annotation : cl.getAnnotations()){
            System.out.println(annotation);
        }//řešení v JmeonoAutor

        Method[] metody = cl.getMethods();
        for(Method method : metody){
            Zpracuj z = method.getAnnotation(Zpracuj.class);
            if(z != null){
                System.out.println(method.getName());
            }
        }
    }
}

