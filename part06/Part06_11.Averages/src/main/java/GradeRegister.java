
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }
    
    public int sumOfGrades() {
        int sum = 0;
        
        if (!(this.grades.isEmpty())) {
            for (int g: this.grades) {
                sum += g;
            }
        }    
        return sum;            
    }
    
    public int sumOfExampoints() {
        int sum = 0;
        
        if (!(this.examPoints.isEmpty())) {
            for (int points: this.examPoints) {
                sum += points;
            }
        }    
        return sum;            
    }
    
    public double averageOfGrades() {
        int sum = sumOfGrades();
        
        if (this.grades.isEmpty()) {
            return -1;
        } else {
            return 1.0 * sum / this.grades.size();
        }
    }
    
    public double averageOfPoints() {
        int sum = sumOfExampoints();
        
        if (this.examPoints.isEmpty()) {
            return -1;
        } else {
            return 1.0 * sum / this.examPoints.size();
        }    
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
