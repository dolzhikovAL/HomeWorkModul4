import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Scanner;

public class homeWorkModul4SecondPart {                     //задание 6-- 2 вариант с глобальным и без влож рек
    private static int right;
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите предел вывода");
        right = scanner.nextInt();
        int down = scanner.nextInt();
        drawRectangle(down, right);
        System.out.println();
        drawRectangle(right);
    }

    public static void drawRectangle(int indown, int inright) {       //рекурсия в 1м методе
        if ((indown > 0) && (inright > 0)) {
            System.out.printf("*" + "  ");
            drawRectangle(indown, inright - 1);
        } else if ((inright == right) && (indown <= 0)) {
        } else {
            inright = right;
            System.out.println();
            drawRectangle(indown - 1, inright);
        }
    }

    public static void drawRectangle(int inright) {                //перегрузка метода

        if (inright > 0) {
            System.out.printf("*" + "  ");
            drawRectangle(inright - 1);
        } else {
            count++;
            if ((inright == 0) && (count == right)) {
                count=0;
            } else {
                inright = right;
                System.out.println();
                drawRectangle(right);
            }
        }
    }
}






