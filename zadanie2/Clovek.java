package zadanie2;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Clovek extends Cicavec implements Restartable {

    private String priezvisko;
    private int vek;
    private int hmotnost;
    private String pohlavie;
    private boolean jeHore;

    public Clovek(){
        super();
        this.priezvisko = null;
        this.vek = 1;
        this.hmotnost = 0;
        this.pohlavie = null;
        this.jeHore = true;
    }

    public Clovek(String meno, String priezvisko){
        super(meno);
        this.priezvisko = priezvisko;
        this.vek = 1;
        this.hmotnost = 0;
        this.pohlavie = null;
        this.jeHore = true;
    }

    public Clovek(String meno, String priezvisko, int vek, int hmotnost, String pohlavie) {
        super(meno);
        this.priezvisko = priezvisko;
        this.vek = vek;
        this.hmotnost = hmotnost;
        this.pohlavie = pohlavie;
        this.jeHore = true;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(int hmotnost) {
        this.hmotnost = hmotnost;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    public boolean isJeHore() {
        return jeHore;
    }

    public void setJeHore(boolean jeHore) {
        this.jeHore = jeHore;
    }

    @Override
    public void cicat() {

    }

    @Override
    public void pohybovatSa() {

    }

    @Override
    public void restart() {
        setMeno(null);
        this.priezvisko = null;
        this.vek = 1;
        this.hmotnost = 0;
        this.pohlavie = null;
        this.jeHore = true;
    }

    public void starnut(){
        vek++;
    }

    public void jedz(){
        hmotnost++;
    }

    public void cvic(){
        hmotnost--;
    }

    public void chodNaOperaciuZmenyPohlavia(String novePohlavie){
        this.pohlavie = novePohlavie;
    }

    public void starni(){
        vek++;
    }

    public void zobuditSa(){
        jeHore = true;
    }

    public void zaspat(){
        jeHore = false;
    }

    public void rozpavat(String s){
        System.out.println(s);
    }
}
