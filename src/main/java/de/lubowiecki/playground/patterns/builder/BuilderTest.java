package de.lubowiecki.playground.patterns.builder;

public class BuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("XYZ");
        sb.append("ABC");
        sb.append(123);
        sb.append(false);
        String str1 = sb.toString(); // Produziert einen immutable String

        sb.append("...");
        String str2 = sb.toString(); // Produziert einen neuen immutable String

        System.out.println();

        Kunde k1 = new Kunde("Bruce", "Banner");
        System.out.println(k1.getVorname() + " " + k1.getNachname());

        Kunde k2 = new Kunde("Bruce", "Parker");
        System.out.println(k2.getVorname() + " " + k2.getNachname());

        System.out.println();

        // Der Builder ist mit bestimmten Werten konfiguriert
        KundenBuilder kundenBuilder = new KundenBuilder();
        kundenBuilder.setVorname("Bruce");
        kundenBuilder.setNachname("Banner");

        Kunde k = kundenBuilder.build();
        System.out.println(k);

        Kunde k3 = kundenBuilder.build();
        System.out.println(k3);

        Kunde k4 = kundenBuilder.build();
        System.out.println(k4);

        System.out.println();
        kundenBuilder.setNachname("Parker");

        k = kundenBuilder.build();
        System.out.println(k);

        k3 = kundenBuilder.build();
        System.out.println(k3);

        k4 = kundenBuilder.build();
        System.out.println(k4);

        System.out.println();

        sb.append(123).append(345);

        Kunde k5 = kundenBuilder.setVorname("Steve").setNachname("...").build(); // Error
        System.out.println(k5);

    }
}
