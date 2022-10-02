package homework;

public class Main {
    public static void main(String[] args) {
        //задание1
        int a = 6;
        int b = 5;
        int c = 8;
        double answer = (a + b + c) / 3f;
        System.out.println("Средний балл " + answer);

        //задание 2

        boolean cold = false;
        boolean hot = true;
        int air_temperature = 30;
        int water_temperature = 28;
        boolean decision = (air_temperature > 28 & water_temperature > 26);
        System.out.println("Петя едет на море -" + decision);
    }
}