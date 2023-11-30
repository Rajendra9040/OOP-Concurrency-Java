package builder;

public class Student {
    private String name;
    private int age;
    private String university;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.university = builder.university;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    static class Builder {
        String name;
        int age;
        String university;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Student build() {
            if (age>30) {
                throw new IllegalArgumentException();
            }
            return new Student(this);
        }
    }

}
