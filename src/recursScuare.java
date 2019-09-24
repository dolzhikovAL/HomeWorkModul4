import java.util.Scanner;

public class recursScuare {
    private static int down;     //глоб перем для фунции квадрата  для хранения размера стороны

    public static void main(String[] args) {
        //Задание 2 функция drowRectangl выводит прямоугольник *

        Scanner scanner = new Scanner(System.in);
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


}

