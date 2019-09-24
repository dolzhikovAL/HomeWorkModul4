import java.util.Scanner;

public class work2 {            //Задание 2 пункит 1 вывод прямоугольника * без рекурсии
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("введите  тип фигуры" + '\n' + "1 - квадрат" + '\n' + "2 прямоугольник");
        int method = scanner.nextInt();
        if (method == 2) {
            System.out.println("введите количество столбиков");
            int a = scanner.nextInt();
            System.out.println("введите количество строк");
            int b = scanner.nextInt();
            drawRectangle(a, b);
        } else {
            System.out.println("введите размер стороны квадрата ");
            int a = scanner.nextInt();
            drawRectangle(a);

        }
    }

    static void drawRectangle(int a, int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("*" + " ");
            }
            System.out.println("");
        }
    }

    static void drawRectangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("*" + " ");
            }
            System.out.println("");
        }

    }
}