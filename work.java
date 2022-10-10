package homework;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replace('A', '#');
        line = line.replace('B', 'A');
        line = line.replace('#', 'B');
        System.out.println(line);

    }
}
