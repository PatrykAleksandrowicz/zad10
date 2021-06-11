package devices;

import creatures.FarmAnimal;
import creatures.Pet;

import java.net.URL;
import java.util.ArrayList;

public class main {
    public static void  main(String[] args){
        Phone p1 = new Phone("11 pro", "Apple", 2018, "IoS");
        ArrayList<String> lista = new ArrayList<String>();
        //URL url = new URL();
        lista.add("ccleaner");
        lista.add("malwarebutes");
        p1.installAnnApp("combofix");
        p1.installAnnApp("combofix","11.1");
        p1.installAnnApp("combofix","11.1", "www.dobreprogramy.pl");
        p1.installAnnApp(lista);
        //p1.installAnnApp(url);

        Disel c1 = new Disel("a3", "audi", "2000", 5000.0, 2019);
        LPG c2 = new LPG("a4", "audi", "2001", 7000.0, 2012);
        Electric c3 = new Electric("a5", "audi", "2002", 9000.0, 2013);

        c1.refuel();
        c2.refuel();
        c3.refuel();

    }
}