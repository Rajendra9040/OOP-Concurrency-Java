package accessSpecifier;

import constructor.School2;

public class Student extends School2 {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student st = new Student("Ram", 26);
        st.location = "Bhubaneswar";
        System.out.println(st.location);
        System.out.println(String.format("My location is%d", 25));
    }
}
