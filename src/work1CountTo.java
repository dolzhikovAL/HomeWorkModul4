import java.util.Scanner;

public class work1CountTo {                // Задача 1 вывод чмсла от 1 до заданного в столбик
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите предел вывода");
        int end = scanner.nextInt();
        printOut(end);
    }

    static void printOut(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);

        }
    }

}

