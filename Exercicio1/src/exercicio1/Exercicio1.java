package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        double ventas[] = new double[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresse las 10 ventas del mes: ");

        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ventas " + (i + 1));
            ventas[i] = sc.nextDouble();
        }

        int k = 0;
        int total = 0;

        while (k < 10) {
            if (ventas[k] >= 2000) {
                System.out.println("$ " + ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("El total de ventas mayores que 2000 es: " + total);

	}

}
