// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = myScan.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            sum += i;
            factorial *= i;
        }
        System.out.printf("%d-е треугольное число: %d\n", num, sum);
        System.out.printf("Факториал числа %d: %d\n", num, factorial);
        myScan.close();
    }
}
