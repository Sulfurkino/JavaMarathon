package day6;

import java.util.Random;

public class Teacher {
    private String TeacherName;
    private String subject;

    public Teacher(String name, String subject) {
        this.subject = subject;
        this.TeacherName = name;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        this.TeacherName = teacherName;
    }



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int grade = random.nextInt(4)+2;
        String evaluation;
        switch (grade) {
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
            default:
                evaluation = "неизвестно";
        }
        System.out.println("Преподаватель " + TeacherName + " оценил студента с именем " + student.getStudentName() +
                " по предмету " + subject + " на оценку " + evaluation + ".");
    }

}
