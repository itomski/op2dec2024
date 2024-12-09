package de.lubowiecki.playground;

public class ObjectTest {

    public static void main(String[] args) {

        // args = Parameter für den Programmstart
        for(String a : args)
            System.out.println(a);

        int i = 10;
        machWas();

        String s = "Moin";
        String s2 = s;

        s2 = s2.toLowerCase();
        System.out.println(s);

        Object s3 = s; // String IS-A Object
        //Integer s4 = s; // String IS-NOT-A Integer

        print("Hallo");
        print(123);
        print(new int[3]);
        print(new Own());

        // Klassenmethoden werden auf dem Bauplan(Klasse) aufgerufen
        // Instanzmethoden werden auf dem konkreten Vertreter der Klasse aufgerufen

        // Referenztyp: Object
        // Objekttyp: String
        // Klassenmethoden werden auf dem Referenztyp ausgeführt
        // Instanzmethoden werden auf IMMER dem Objekttyp ausgeführt
        Object o = new String();
    }

    public static void machWas() {
        int i = 20;
    }

    public static void print(Object o) {
        System.out.println(o.toString() + "#####");
    }
}

class Own {
}