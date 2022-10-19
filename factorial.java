package homework;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int number = 8;
        int result = 1;
        int i =1;
        while ( i <= number) {
            result =  result * i;
            i++;
            }
            System.out.println(result);
        }
    }

