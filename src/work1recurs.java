import java.util.Scanner;

public class work1recurs {                     //Задача 5 вывод чисел от 1 до заданного в столбик
    public static void main(String[] args) {   // (задача 1 с использованием рекурсии)
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите предел вывода");
        int end = scanner.nextInt();
        printOutRecurs(end, end);
    }

    static void printOutRecurs(int x, int y) {            //rec
        if (y < 0)
            return;
        System.out.println((x - y));
        printOutRecurs(x, (y - 1));



    }
}
