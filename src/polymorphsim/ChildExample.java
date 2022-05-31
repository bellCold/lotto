package polymorphsim;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.method1();
        parent.method2();
        parent.field = "";

        Child child = (Child) parent;

    }
}
