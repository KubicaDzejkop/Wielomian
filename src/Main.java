import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj stopień wielomianu");

        Scanner scanner = new Scanner(System.in);
        int degree = scanner.nextInt();

        double[] arrayElements = new double[degree + 1];
        for (int i = 0; i < arrayElements.length; i++) {
            System.out.println("Podaj współczynnik stopnia " + (arrayElements.length - i - 1) + ":");
            arrayElements[i] = scanner.nextDouble();

        }
        System.out.println("Podaj pierwiastek");
        double pierwiastek = scanner.nextDouble();

        boolean wynik = czyPierwiastek(pierwiastek, arrayElements);
        if(wynik == true){
            System.out.println("Jest to pierwiastek");
        }else{
            System.out.println("Nie jest to pierwiastek");
        }

    }


    public static boolean czyPierwiastek(double pierwiastek, double[] arrayElements) {
        double result = 0;
        int sizeArray = arrayElements.length;
        for (int i = 0; i < sizeArray; i++) {
            result += arrayElements[i] * pow(pierwiastek, sizeArray - i - 1);
        }
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }
}