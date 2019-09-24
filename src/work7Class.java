import java.util.Scanner;

public class work7Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-функция вывода от 1 до Х");
        System.out.println("2-Рисуеи прямоугольник ");
        System.out.println("3-рисуем квадрат");
        System.out.println("4-выбираем большее число");
        System.out.println("5-выводим число от 1 до Х рекурсией");
        System.out.println("6-Рисуем фигуры рекурсией");
        System.out.println("для выхода любое другое число");
        int method;
        do {
            System.out.println("Ввдите номер задачи от 1 до 6 или другое число для выхода");
            method = scanner.nextInt();
            switch (method) {
                case 1:
                    work1CountTo.main(args);
                case 2:
                case 3:
                    work2.main(args);
                case 4:
                    work4GetMax.main(args);
                case 5:
                    work1recurs.main(args);
                case 6:
                    recursScuare.main(args);
            }
        } while (method > 0 && method < 7);
    }
}
