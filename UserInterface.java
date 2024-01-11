import java.util.Scanner;


public class UserInterface {

    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {

        this.scanner = new Scanner(System.in);
        this.register = register;
    }

    public void start() {

        readPoints();

        printAverage();
        printPassingAverage();
        printPassPercentage();
        printGradeDistribution();
    }

    public void readPoints() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                break;
            }
            if (points <= 100 && points >= 0) {
                register.addGrade(points);
            }
        }
    }

    public void printAverage() {

        double average = register.averageOfGrades();
        System.out.println("Point average (all): " + average);
    }

    public void printPassingAverage() {

        double passingAverage = register.averageOfPassingGrades();

        if (passingAverage == 0.00) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage);
        }
    }

    public void printPassPercentage() {

        double passPercentage = register.passPercentage();
        System.out.println("Pass percentage: " + passPercentage);
    }

    public static void printStars(int stars) {

        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
        System.out.println("");
    }

    public void printGradeDistribution() {

        int[] distributedGrades = register.gradeDistribution();

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");

            printStars(distributedGrades[i]);
        }
    }
}
