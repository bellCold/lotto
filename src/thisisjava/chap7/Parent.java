package thisisjava.chap7;

public class Parent {
    public String nation;

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) Call");
    }

    public Parent() {
        this("대한민국");
        System.out.println("Parent() Call");


    }
}

