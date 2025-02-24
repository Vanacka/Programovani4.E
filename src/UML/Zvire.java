package UML;

public class Zvire {
    int vaha;
    Organ[] vsechnyOrgany;

    public Zvire(int vaha, Organ[] vsechnyOrgany) {
        this.vaha = vaha;
        this.vsechnyOrgany = vsechnyOrgany;
    }

    int vahaVsechOrganu() {
        int celkovaVaha = 0;
        for (int i = 0; i < vsechnyOrgany.length; i++) {
            celkovaVaha += vsechnyOrgany[i].vaha;
        }
        return celkovaVaha;
    }
}
