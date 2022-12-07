// Реализовать простой калькулятор

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор.");
        System.out.print("Введите первое число: ");
        float num_a = myScan.nextInt();
        System.out.print("Введите второе число: ");
        float num_b = myScan.nextInt();
        System.out.print("Выберите операцию из предложенных: + - / * : ");
        char operation = myScan.next().charAt(0);
        float res;
        switch (operation) {
            case '+':
                res = num_a + num_b;
                System.out.printf("%.2f + %.2f = %.2f\n", num_a, num_b, res);
                break;
            case '-':
                res = num_a - num_b;
                System.out.printf("%.2f - %.2f = %.2f\n", num_a, num_b, res);
                break;
            case '/':
                res = num_a / num_b;
                System.out.printf("%.2f / %.2f = %.2f\n", num_a, num_b, res);
                break;
            case '*':
                res = num_a * num_b;
                System.out.printf("%.2f * %.2f = %.2f\n", num_a, num_b, res);
                break;
        }
        myScan.close();
    }
}