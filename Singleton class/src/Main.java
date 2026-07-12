//singleton class means cannot create more than one object

public class Main {
    public static void main(String[] args) {
        Student obj1 = Student.getInstance();
        obj1.name = "Manoj";
        Student obj2 = Student.getInstance();
        System.out.println(obj2.name);
    }
}
