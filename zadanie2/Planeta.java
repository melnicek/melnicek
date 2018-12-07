package zadanie2;

import java.util.HashSet;
import java.util.Set;

public class Planeta {
    private String meno;
    private double hmotnost;
    private double priemer;
    private double vzdialenost;
    private boolean tociSa;
    private Set<Clovek> zoznam;

    public Planeta(String meno, double hmotnost, double priemer, double vzdialenost) {
        this.meno = meno;
        this.hmotnost = hmotnost;
        this.priemer = priemer;
        this.vzdialenost = vzdialenost;
        this.tociSa = false;
        this.zoznam = new HashSet<>();
    }

    public void zmenTocenie(){
        tociSa = !tociSa;
    }

    public void pridatCloveka(Clovek c){
        zoznam.add(c);
    }

    public void odstranCloveka(Clovek c){
        zoznam.remove(c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Clovek c :
                zoznam) {
            sb.append(c.getMeno()+" "+c.getPriezvisko()+"\n");

        }
        return sb.toString();
    }
}
