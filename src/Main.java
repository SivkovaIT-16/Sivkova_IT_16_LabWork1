import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab1 l = new Lab1();

//        System.out.println("Задача 1.1");
//        System.out.println("Введите вещественное число.");
//        double x1_1 = scanner.nextDouble();
//
//        double y1_1 = l.fraction(x1_1);
//        System.out.println("Дробная часть введённого числа: " + y1_1);

//        System.out.println("Задача 1.3");
//        System.out.println("Введите символ (одну из цифр).");
//        char x1_3 = scanner.next().charAt(0);
//
//        if (!xIsChar(x1_3)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        int y1_3 = l.charToNum(x1_3);
//        System.out.println("Символ преобразованный в число: " + y1_3);

//        System.out.println("Задача 1.5");
//        System.out.println("Введите целое число.");
//        int x1_5 = scanner.nextInt();
//
//        boolean y1_5 = l.is2Digits(x1_5);
//        System.out.println("Число двухзначное? " + y1_5);

//        System.out.println("Задача 1.7");
//        System.out.println("Введите первую границу диапазона.");
//        int a = scanner.nextInt();
//        System.out.println("Введите вторую границу диапазона.");
//        int b = scanner.nextInt();
//        System.out.println("Введите целое число.");
//        int num = scanner.nextInt();
//
//        boolean y1_7 = l.isInRange(a, b, num);
//        System.out.println("Число принадлежит указанному диапазону? " + y1_7);

//        System.out.println("Задача 1.9");
//        System.out.println("Введите первое число.");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число.");
//        int b = scanner.nextInt();
//        System.out.println("Введите третье число.");
//        int c = scanner.nextInt();
//
//        boolean y1_9 = l.isEqual(a, b, c);
//        System.out.println("Три числа равны? " + y1_9);

//        System.out.println("Задача 2.1");
//        System.out.println("Введите целое число.");
//        int x2_1 = scanner.nextInt();
//
//        int y2_1 = l.abs(x2_1);
//        System.out.println("Модуль введённого числа: " + y2_1);

//        System.out.println("Задача 2.3");
//        System.out.println("Введите целое число.");
//        int x2_3 = scanner.nextInt();
//
//        boolean y2_3 = l.is35(x2_3);
//        System.out.println("Число  делится нацело на 3 или на 5? " + y2_3);

//        System.out.println("Задача 2.5");
//        System.out.println("Введите первое число.");
//        int x2_5 = scanner.nextInt();
//        System.out.println("Введите второе число.");
//        int y2_5 = scanner.nextInt();
//        System.out.println("Введите третье число.");
//        int z2_5 = scanner.nextInt();
//
//        int res2_5 = l.max3(x2_5, y2_5, z2_5);
//        System.out.println("Максимальное из чисел: " + res2_5);

//        System.out.println("Задача 2.7");
//        System.out.println("Введите первое число.");
//        int x2_7 = scanner.nextInt();
//        System.out.println("Введите второе число.");
//        int y2_7 = scanner.nextInt();
//
//        int res2_7 = l.sum2(x2_7, y2_7);
//        System.out.println("Сумма двух чисел: " + res2_7);

//        System.out.println("Задача 2.9");
//        System.out.println("Введите целое число.");
//        int x2_9 = scanner.nextInt();
//
//        String y2_9 = l.day(x2_9);
//        System.out.println("День недели: " + y2_9);

//        System.out.println("Задача 3.1");
//        System.out.println("Введите целое число.");
//        int x3_1 = scanner.nextInt();
//
//        if (!xIsNatural(x3_1)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        String y3_1 = l.listNums(x3_1);
//        System.out.println("Результат: " + y3_1);

//        System.out.println("Задача 3.3");
//        System.out.println("Введите целое число.");
//        int x3_3 = scanner.nextInt();
//
//        if(!xIsNatural(x3_3)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        String y3_3 = l.chet(x3_3);
//        System.out.println("Результат: " + y3_3);

//        System.out.println("Задача 3.5");
//        System.out.println("Введите целое число.");
//        int x3_5 = scanner.nextInt();
//
//        if (!xIsNatural(x3_5)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        int y3_5 = l.numLen(x3_5);
//        System.out.println("Количество знаков в числе: " + y3_5);

//        System.out.println("Задача 3.7");
//        System.out.println("Введите целое число.");
//        int x3_7 = scanner.nextInt();
//
//        if (!xIsNatural(x3_7)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        l.square(x3_7);

//        System.out.println("Задача 3.9");
//        System.out.println("Введите целое число.");
//        int x3_9 = scanner.nextInt();
//
//        if (!xIsNatural(x3_9)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        l.rightTriangle(x3_9);

//        System.out.println("Задача 4.1");
//        System.out.println("Введите целое число (количество элементов массива).");
//        int n4_1 = scanner.nextInt();
//
//        if (!xIsNatural(n4_1)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        if (!MasSize(n4_1)) {
//            System.out.println("Массив пустой.");
//            return;
//        }
//
//        int[] arr = new int[n4_1];
//        for (int i = 0; i < n4_1; i++) {
//            System.out.println("Введите " + (i + 1) + " элемент массива.");
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println("Введите чсило x, индекс которого необходимо найти.");
//        int x4_1 = scanner.nextInt();
//
//        int y4_1 = l.findFirst(arr, x4_1);
//        System.out.println("Индекс первого вхождения числа " + x4_1 + " в массив: " + y4_1);

//        System.out.println("Задача 4.3");
//        System.out.println("Введите целое число (количество элементов массива).");
//        int n4_3 = scanner.nextInt();
//
//        if (!xIsNatural(n4_3)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        if (!MasSize(n4_3)) {
//            System.out.println("Массив пустой.");
//            return;
//        }
//
//        int[] arr = new int[n4_3];
//        for (int i = 0; i < n4_3; i++) {
//            System.out.println("Введите " + (i + 1) + " элемент массива.");
//            arr[i] = scanner.nextInt();
//        }
//
//        int y4_3 = l.maxAbs(arr);
//        System.out.println("Наибольшее по модулю значение массива: " + y4_3);

//        System.out.println("Задача 4.5");
//        System.out.println("Введите целое число (количество элементов массива arr).");
//        int n4_5 = scanner.nextInt();
//
//        if (!xIsNatural(n4_5)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        if (!MasSize(n4_5)) {
//            System.out.println("Массив arr пустой.");
//            return;
//        }
//
//        int[] arr = new int[n4_5];
//        for (int i = 0; i < n4_5; i++) {
//            System.out.println("Введите " + (i + 1) + " элемент массива arr.");
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.println("Введите целое число (количество элементов массива ins).");
//        int m4_5 = scanner.nextInt();
//
//        if (!xIsNatural(m4_5)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        if (!MasSize(m4_5)) {
//            System.out.println("Массив ins пустой.");
//            return;
//        }
//
//        int[] ins = new int[m4_5];
//        for (int i = 0; i < m4_5; i++) {
//            System.out.println("Введите " + (i + 1) + " элемент массива ins.");
//            ins[i] = scanner.nextInt();
//        }
//
//        System.out.println("Введите позицию pos.");
//        int pos = scanner.nextInt();
//
//        if (!xIsNatural(pos) || pos > n4_5) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        int[] y4_5 = l.add(arr, ins, pos);
//        System.out.print("Новый массив:  ");
//        for (int i = 0; i < y4_5.length; i++) {
//            System.out.print(y4_5[i] + " ");
//        }

//        System.out.println("Задача 4.7");
//        System.out.println("Введите целое число (количество элементов массива).");
//        int n4_7 = scanner.nextInt();
//
//        if (!xIsNatural(n4_7)) {
//            System.out.println("Ошибка ввода.");
//            return;
//        }
//
//        if (!MasSize(n4_7)) {
//            System.out.println("Массив пустой.");
//            return;
//        }
//
//        int[] arr = new int[n4_7];
//        for (int i = 0; i < n4_7; i++) {
//            System.out.println("Введите " + (i + 1) + " элемент массива.");
//            arr[i] = scanner.nextInt();
//        }
//
//        int[] y4_7 = l.reverseBack(arr);
//        System.out.print("Новый массив:  ");
//        for (int i = 0; i < y4_7.length; i++) {
//            System.out.print(y4_7[i] + " ");
//        }

        System.out.println("Задача 4.9");
        System.out.println("Введите целое число (количество элементов массива).");
        int n4_9 = scanner.nextInt();

        if (!xIsNatural(n4_9)) {
            System.out.println("Ошибка ввода.");
            return;
        }

        if (!MasSize(n4_9)) {
            System.out.println("Массив пустой.");
            return;
        }

        int[] arr = new int[n4_9];
        for (int i = 0; i < n4_9; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива.");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Введите число x, индексы которого необходимо найти.");
        int x4_9 = scanner.nextInt();

        int[] y4_9 = l.findAll(arr, x4_9);
        System.out.print("Индексы вхождения числа " + x4_9 + " в массив:  ");
        for (int i = 0; i < y4_9.length; i++) {
            System.out.print(y4_9[i] + " ");
        }

        scanner.close();
    }
    private static boolean xIsChar(char ch) {
        return ch >= '0' && ch <= '9';
    }
    private static boolean xIsNatural(int x) {
        return x >= 0;
    }
    private static boolean MasSize(int n) {
        return n != 0;
    }
}

