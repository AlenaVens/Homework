package org;

import java.util.Scanner;

public class apfel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        int time = scanner.nextInt();
        int distance = scanner.nextInt();
        int distanceMery = speed * time;
        int distanceSherlock = distance - distanceMery;
        if (distanceSherlock > distanceMery) {
            System.out.println("Mery");
        } else {
            System.out.println("Sherlock");
        }
    }
}

