package zadanie2;

import java.io.*;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) throws IOException {
/*
        BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
        int x = Integer.parseInt(in.readLine());
        System.out.println(x);
        in.close();

        BufferedWriter out = new BufferedWriter(new FileWriter(new File("input.txt")));
        out.write(""+(x+1));
        out.close();


*/
        Vesmir vesmir = new Vesmir();

        Planeta zem = new Planeta("ZEM", 9999,50,8888);

        Set<Planeta> set = vesmir.getZoznam();
        set.add(zem);
        vesmir.setZoznam(set);

        Clovek adam = new Clovek("Adam","Prvy",1,80,"muz");
        zem.pridatCloveka(adam);
        adam.zaspat();

        Clovek eva = new Clovek("Eva","Prva",1,50,"zena");
        zem.pridatCloveka(eva);
        adam.zobuditSa();

        adam.rozpavat("lorem ipsum dolor sit amet");
        eva.rozpavat("consectetur adipiscing elit");
        adam.rozpavat("sed do eiusmod tempor incididun ipsum");
        eva.rozpavat("exercitation ullamco laboris nisi ut aliquip");
        adam.rozpavat("uis aute irure dolor in reprehenderit");

        adam.zaspat();
        eva.zaspat();

        System.out.println("------------------------------");

        System.out.println(zem.toString());

        System.out.println("------------------------------");

        for (int i = 0; i < 10000; i++) {
            Clovek anon = new Clovek(generujMeno(),generujMeno());
            zem.pridatCloveka(anon);
        }

        //System.out.println(zem.toString());

        sadable[] vedrobandur = new Zemiak[1000];
        sadable[] mechkapusty = new Kapusta[1000];
        sadable[] mechCibule = new Cibula[500];
        sadable[] semienkaMrkvy = new Mrkva[5000];
        sadable[] semienkaPetrzlenu = new Petrzlen[5000];

    }

    //############################################################
    static final String pismena = "abcdefghijklmnopqrstuvwxyz";

    static final java.util.Random rand = new java.util.Random();

    public static String generujMeno() {
        StringBuilder sb = new StringBuilder();
        while(sb.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                sb.append(pismena.charAt(rand.nextInt(pismena.length())));
            }
        }
        return sb.toString();
    }
}
