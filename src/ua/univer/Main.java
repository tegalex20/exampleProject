package ua.univer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int value = sc.nextInt();

        if (value <= 0) {
            throw new UnsupportedOperationException();
        }
        int z = 0;
        while (value > 0) {

            int y = value % 10;
            if (y % 2 == 1) {
                z = z + y;
            }
            value = value / 10;

        }
        System.out.println("Число N= " + z);

        System.out.println("Ввели число=" + value);
    }

}

