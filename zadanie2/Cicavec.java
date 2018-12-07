package zadanie2;

public abstract class Cicavec {
    private String meno;

    public Cicavec(){
        this.meno=null;
    }

    public Cicavec(String meno) {
        this.meno = meno;
        narodSa();
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    private void narodSa(){

    }

    public abstract void cicat();
    public abstract void pohybovatSa();
}
