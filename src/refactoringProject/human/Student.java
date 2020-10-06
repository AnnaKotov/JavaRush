package refactoringProject.human;

import java.util.Date;

public class Student extends UniversityPerson {
    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name,age);
        this.averageGrade = averageGrade;
    }



    public void live() {
        learn();
    }

    public void learn() {
    }



    public void incAverageGrade(double delta){
        double grade = getAverageGrade();
        grade+=delta;
        setAverageGrade(grade);
    }

    public void setAverageGrade(double grade){
        this.averageGrade = grade;
    }

    public void setCourse(int course){
        this.course = course;
    }

    @Override
    public String getPosition() {
        return "Студент";
    }

    public void setBeginningOfSession(Date date) {
        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

}