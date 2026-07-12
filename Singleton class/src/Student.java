public class Student {
    String name;
    private Student() {

    }
    private static Student instance;

    public static Student getInstance() {
        if(instance == null) {
            instance = new Student();
        }
        return instance;
    }
}
