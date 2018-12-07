package zadanie2;

import java.util.HashSet;
import java.util.Set;

public class Vesmir {

    private Set<Planeta> zoznam;

    public Vesmir() {
        this.zoznam = new HashSet<>();
    }

    public Set<Planeta> getZoznam() {
        return zoznam;
    }

    public void setZoznam(Set<Planeta> zoznam) {
        this.zoznam = zoznam;
    }
}
