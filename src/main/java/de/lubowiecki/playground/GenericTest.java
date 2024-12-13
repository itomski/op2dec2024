package de.lubowiecki.playground;

public class GenericTest {

    public static void main(String[] args) {

        StringBox box = new StringBox("Hallo");
        System.out.println(box.getContent());

        Box<String> box2 = new Box<>("Hallo");
        System.out.println(box2.getContent());

        Box<Integer> box3 = new Box<>(123);
        System.out.println(box3.getContent());

        Box<Person> box4 = new Box<>(new Person());
        System.out.println(box4.getContent());
    }
}

class Box<T> {

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}



class StringBox {

    private String content;

    public StringBox(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class IntegerBox {

    private int content;

    public IntegerBox(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }
}
