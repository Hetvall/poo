public class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void study() {
        System.out.println("The student " + name + " is currently studying");
    }
}
