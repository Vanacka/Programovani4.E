package Anotace;

import lombok.Data;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Deprecated
@Data
public class Ctverec {

    public String namalujSe() {
        return "****\n****\n****\n****";
    }

    public double plocha() {
        return  16;
    }

    public static void main(String[] args) {
        Ctverec c = new Ctverec();

        Class<?> cl = c.getClass();
        System.out.println(cl.getCanonicalName());

        Annotation[] annots = cl.getAnnotations();

        System.out.println("anotace:"+ annots.length);

        for (Annotation anno : annots) {
            System.out.println(anno);
        }

        Method[] ms = cl.getMethods();

        System.out.println("Metod: " + ms.length);

        for(Method m : ms) {
            System.out.println(m.getName());
            Annotation[] methodAnno = m.getAnnotations();
            for (Annotation anno : methodAnno) {
                System.out.println("Anotation: " + anno.annotationType().getSimpleName());
            }
            System.out.println();
        }
    }
    /*
    kokot pero ja si nasadim na hlavu skero
    tak to je rym a zadny sprym
    je to sprym jak z pytle vytazen
    to same jako kdyz je kondom na pero nasazen
    nase basen  smysl krasny dava
    moje hlava to vsak nezvlada
    na to se napijem
    a jako vlci na mesic zavijem
    noc je tmava jako Tobias
    tak pozor dej na zidy jinak budes Jidas
*/
}
