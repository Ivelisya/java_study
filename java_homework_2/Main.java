package java_homework_2;

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("年龄必须在0~150之间！");
        }
    }

    public void speak() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("Alice");
        s1.setAge(20);
        s2.setName("Bob");
        s2.setAge(22);

        s1.speak();
        s2.speak();

        s3 = s2;
        s3.speak();

        // Test age restriction
        s1.setAge(160);
        s1.speak();
    }
}