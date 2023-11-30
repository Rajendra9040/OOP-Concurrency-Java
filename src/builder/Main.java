package builder;

public class Main {
    public static void main(String[] args) {
//        Student.Builder builder = Student.getBuilder();
        Student student = Student.getBuilder().setName("Raju").setAge(25).setUniversity("Scaler").build();
        System.out.println(student.getName());
    }
}
