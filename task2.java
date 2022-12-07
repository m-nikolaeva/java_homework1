// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        boolean flag = true;
        for (int num = 2; num <= 1000; num++) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
            if (flag)
                System.out.println(num);
            else
                flag = true;
        }
    }
}
