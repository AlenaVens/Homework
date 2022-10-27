package homework;

import java.util.Scanner;

public class vkladBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        int percent = scanner.nextInt();
        int years = scanner.nextInt();
        for (int i =0; i < years; i++)
            deposit +=  (deposit * percent / 100);
        System.out.println(deposit);
    }
}
