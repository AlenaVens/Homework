package homework;

public class Main {
    public static void main(String[] args) {
        boolean cold = false;
        boolean hot = true;
        int air_temperature = 30;
        int water_temperature = 28;
        boolean answer = (air_temperature > 28 & water_temperature > 26);
        System.out.println("Петя едет на море -" + answer);
    }
}