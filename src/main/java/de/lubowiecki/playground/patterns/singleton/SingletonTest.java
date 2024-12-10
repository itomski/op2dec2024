package de.lubowiecki.playground.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        LoggerSingleton.getInstance().log("Ich bin in der main");

        EagerSingleton s1 = EagerSingleton.getInstance();
        s1.up();
        s1.up();
        doSommething();
        doSommething();

        System.out.println(s1.getZahl());

        EagerSingleton s2 = EagerSingleton.getInstance();
        s2.up();
        s2.up();
        doSommething();
        System.out.println(s2.getZahl());

        System.out.println(s1 == s2);
        System.out.println(s1 == EagerSingleton.getInstance());

        LoggerSingleton.getInstance().print();
    }

    private static void doSommething() {
        // EagerSingleton = Klassenname
        // getInstance() = Klassenmethode
        // up() = Instanzmethode
        EagerSingleton.getInstance().up();
        LoggerSingleton.getInstance().log("Ich bin in der doSomething");
    }
}
