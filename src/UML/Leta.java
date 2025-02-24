package UML;

public class Leta extends Zvire {
    Kridlo kridlo;

    public Leta(int vaha, Organ[] vsechnyOrgany, Kridlo kridlo) {
        super(vaha, vsechnyOrgany);
        this.kridlo = kridlo;
    }
}
