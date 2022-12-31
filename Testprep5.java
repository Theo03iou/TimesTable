import java.util.Scanner;

public class Testprep5 {

    public static void main(String[] args) {
        takeStartEnd();
    }

    private static void takeStartEnd() {
        System.out.println("Enter x start (start>0):");
        Scanner scanner = new Scanner(System.in);
        int xStart = scanner.nextInt();
        System.out.println("Enter x end (end>=start):");
        int xEnd = scanner.nextInt();

        oneTimes(xStart, xEnd);
        scanner.close();
        
    }

    private static void oneTimes(int xStart, int xEnd) {
        int i = xEnd - xStart;
        int correctAnswers = 0;
        int incorrectAnswer = 0;

        for (int j = xStart; j <= xEnd; j++) {

            for (int t = 1; t < 13; t++) {
                System.out.println("What is " + j + " x " + (t));
                Scanner scanner = new Scanner(System.in);
                int userAnswer = scanner.nextInt();
                int realAnswer = j * t;
                
                if (userAnswer == realAnswer) {
                    System.out.println("Correct");
                    correctAnswers++;
                } else {
                    System.out.println("Incorrect");
                    incorrectAnswer++;
                }
            }
        }

        calculate(correctAnswers, incorrectAnswer);
    }

    private static void calculate(int correctAnswers, int incorrectAnswer) {
        String grade;
        int totalAnswers = correctAnswers + incorrectAnswer;
        System.out.println("You had " + correctAnswers + " correct answers");

        double percentage = Math.round((correctAnswers / totalAnswers) * 100);

        if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >=40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("You scored " + correctAnswers + "/" + totalAnswers + "(" + percentage + ")" + grade + " grade.");
        
    }
}
