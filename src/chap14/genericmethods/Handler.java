package chap14.genericmethods;


import chap14.ComprendesMendes;

import java.util.ArrayList;
import java.util.List;

public class Handler {
    //if we remove <T> DNC since T class isn't imported
    public <T> void prepare(T t){
        System.out.println("Preparing " + t);
    }

    public static <T> void print(T t){
        System.out.println("print method " + t);
    }

    public <T> Crate<T> ship(T t){
        System.out.println("Shipping " + t);
        return new Crate<>(t);
    }

    public <T> Crate mayk(T t){
        return new Crate(t);
    }

    public static void main(String[] args) {
        Handler handle = new Handler();
        handle.prepare("String");
        handle.prepare(3);

        List<String> derdo = new ArrayList<>();
        derdo.add("Semir");
        handle.prepare(derdo);

        ComprendesMendes comprendesMendes = new ComprendesMendes();
        comprendesMendes.setComprende("trabajo");
        comprendesMendes.setAmigo("El Pollo Loco");
        Crate  crateIste = handle.ship(comprendesMendes);
        Crate<ComprendesMendes>  crateIste2 = handle.ship(comprendesMendes);

        System.out.println(crateIste.getContents());
        System.out.println(crateIste2);

        List<StringBuilder> penceremdenDisarisi = new ArrayList<>();
        penceremdenDisarisi.add(new StringBuilder("Ceviz Agaci"));
        penceremdenDisarisi.add(new StringBuilder("Kir Cicekleri"));

        Crate ilkayAkkaya = handle.mayk(penceremdenDisarisi);
        System.out.println(ilkayAkkaya);

        Handler.<String>print("Optional Invoking a Generic Method");
        Handler.<List<StringBuilder>>print(penceremdenDisarisi);



    }
}
