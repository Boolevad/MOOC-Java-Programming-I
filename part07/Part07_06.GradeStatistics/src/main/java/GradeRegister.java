import java.util.ArrayList;
        
public class GradeRegister {
   
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }
    
    public void addGrade(int grade) {
        if (grade >= 50) {
            this.passingGrades.add(grade);
        }
        this.grades.add(grade);
    }
    
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    
   
    public boolean isPassing(int grade) {
        return grade >= 50;
    }  
    
    
    public double averageOfGrades() {
        
        double sum = 0.0;
        
        if (grades.isEmpty()) {
            return -1;
        } else {
            for (double grade: grades) {
            sum += grade;
            }
        }
        double average = (double)sum / grades.size();
        return average;
       
    }
    
    public double averageOfPassingGrades() {
        
        double sum = 0.0;
        
        if (passingGrades.isEmpty()) {
            return 0.00;
        } else {
            for (double grade: passingGrades) {
                sum += grade;
            }
        }    
        double average = (double)sum / passingGrades.size();
        return average;
        
    }
    
    public double passPercentage() {
        
        int passing = passingGrades.size();
        int participants = grades.size();
        
        if (participants == 0) {
            return -1;
        } else {
            return 100.00 * passing / participants;
        }
    }
    
      
    public int[] gradeDistribution() {
        
        int[] distributedGradesArray = new int[6];
      
        for (int grade: this.grades) {
            if (grade < 50) {
                distributedGradesArray[0]++;
            } else if (grade < 60) {
                distributedGradesArray[1]++;
            } else if (grade <70) {
                distributedGradesArray[2]++;
            } else if (grade < 80) {
                distributedGradesArray[3]++;
            } else if (grade <90) {
                distributedGradesArray[4]++;
            } else {
                distributedGradesArray[5]++;
            }
        }
        return distributedGradesArray;
    }
}
