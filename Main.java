package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задание1
        Scanner scanner = new Scanner(System.in);
        int gradeMath = scanner.nextInt();
        int gradeHistory = scanner.nextInt();
        int gradeBiology = scanner.nextInt();
        double answer= gradeMath + gradeHistory + gradeBiology/3.0;
        System.out.println("Средний балл " + answer);

        //задание 2

        boolean cold = false;
        boolean hot = true;
        int airTemperature = scanner.nextInt();
        int waterTemperature = scanner.nextInt();
        boolean decision = (airTemperature > 28 && waterTemperature > 26);
        System.out.println("Петя едет на море -" + decision);
    }
}
