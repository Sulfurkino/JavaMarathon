package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Группа 1");
        Teacher teacher = new Teacher("Петр", "Математика");

        System.out.println("Учебная группа студента: " + student.getGroup());
        System.out.println("Предмет преподавателя: " + teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
