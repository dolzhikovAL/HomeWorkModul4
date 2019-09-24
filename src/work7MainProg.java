import java.util.Scanner;

public class work7MainProg {
    private static int down;     //глоб перем для фунции квадрата  для хранения размера стороны

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
            System.out.println("Ввдите номер задачи от 1 до 6");
            method = scanner.nextInt();
            switch (method) {
                case 1:
                    work();  // функция 1й задачи
                case 2:
                    work2();
                case 3:
                    work3();
                case 4:
                    work4();
                case 5:
                    work5();
                case 6:
                    work6();
            }
        } while (method > 0 && method < 7);

    }

    static void work() {         // задача1 ввод
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите предел вывода");
        int end = scanner.nextInt();
        printOut(end);
    }

    static void printOut(int x) {              //задача1 функция
        for (int i = 1; i <= x; i++) {
            System.out.println(i);

        }
    }

    static void work5() {   //                (задача 1 с использованием рекурсии)
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите предел вывода");
        int end = scanner.nextInt();
        printOutRecurs(end, end);
    }

    static void printOutRecurs(int x, int y) {           //рекурсия1й задачи
        if (y < 0)
            return;
        System.out.println((x - y));
        printOutRecurs(x, (y - 1));
    }

    static void work3() {
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

    static void work6() {

        Scanner scanner = new Scanner(System.in);    //Задание 2 функция drowRectangl выводит прямоугольник *
        System.out.println("введите  тип фигуры" + '\n' + "1 - квадрат" + '\n' + "2 прямоугольник");
        int method = scanner.nextInt();
        switch (method) {                            //выбор фигуры и метода с 1м или 2мя параметрами
            case 1: {
                System.out.println("введите размер стороны квадрата ");
                down = scanner.nextInt();
                drowRectangle(down);
                break;
            }
            case 2: {
                System.out.println("введите ширину прямоугольника");
                int right = scanner.nextInt();
                System.out.println("введите высоту прямоугольника");
                down = scanner.nextInt();
                drowRectangle(down, right);
            }
        }
    }

    public static void drowRectangle(int indown, int inright) {  //рекурсия прямоугольника с 2мя параметрами
        if (indown <= 0)
            return;
        drawString(inright);
        System.out.println("");
        drowRectangle(indown - 1, inright);
    }

    public static void drowRectangle(int indown) {           //перегруженная drowRectangl для 1го параметра
        if (indown <= 0)
            return;
        drawString(down);
        System.out.println("");
        drowRectangle(indown - 1);
    }

    static void drawString(int inright) {     //рекурсия строки
        if ((inright <= 0))
            return;
        if (inright > 0) {
            System.out.printf("*" + "  ");
            drawString(inright - 1);
        }
    }

    static void work2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество столбиков");
        int a = scanner.nextInt();
        System.out.println("введите количество строк");
        int b = scanner.nextInt();
        drawRectangleF(a, b);
    }

    static void drawRectangleF(int a, int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("*" + " ");
            }
            System.out.println("");
        }

    }

    static void work4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите для сравнения А и В ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if ((a % 1 == 0) && (b % 1 == 0)) {
            int c = (int) a;
            int d = (int) b;
            System.out.println(max(c, d));
        } else
            System.out.println(max(a, b));
    }

    public static int max(int c, int d) {
        int mc = c > d ? c : d;
        return (mc);
    }

    public static float max(float c, float d) {
        float mc = c > d ? c : d;
        return (mc);

    }

}