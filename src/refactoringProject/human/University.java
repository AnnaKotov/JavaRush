package refactoringProject.human;

import java.util.ArrayList;
import java.util.List;

public class University {
   private  String name;
   private int age;
   private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) return student;
        }

        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double max = students.get(0).getAverageGrade();
        Student student = students.get(0);
        for (int i = 1; i < students.size() ; i++) {
            if(students.get(i).getAverageGrade() > max) {
                student = students.get(i);
                max =student.getAverageGrade();
            }
        }
        return student;
    }
    

    public Student getStudentWithMinAverageGrade(){
        Student student = students.get(0);
        double min = student.getAverageGrade();
        for (int i = 1; i < students.size() ; i++) {
            if(min > students.get(i).getAverageGrade()) {
                student = students.get(i);
                min = student.getAverageGrade();
            }

        }

        return student;
    }

    public void expel(Student student){
        students.remove(student);
    }
}