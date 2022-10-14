package homework;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        char last = s.charAt((length) - 1);
        if (length < 6 | last !='!')
        {
            System.out.println("Ваш пароль неверный");
        }
        else{
            System.out.println("Пароль принят");
        }
    }
}
