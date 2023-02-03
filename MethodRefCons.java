@FunctionalInterface
interface MyInterface {
    Student getStudent(String string, int i);
}

public class MethodRefCons {

    public static void main(String[] args) {

        MyInterface obj = Student::new;

        System.out.println(obj.getStudent("Abhi", 20).getName() + obj.getStudent("Abhi", 20).getAge());

    }

}
