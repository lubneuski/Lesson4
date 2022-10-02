import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
        scanner.close();
      }

    private static void task0() {
//  Задание 0. Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
//             входит ли заданное число в массив или нет.
        System.out.println("\nЗадание 0. Входит ли заданное число в массив или нет");

        int[] massiv = {0, 1, -1, -2, 3, 5, 6, 7, 5, 8, 9, 11};
        Arrays.sort(massiv);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        int X = Arrays.binarySearch(massiv, number);
        if (X >= 0) {System.out.println(number + " Входит с индексом " + X);}
        else {System.out.println(number + " Не входит");}
    }

    private static void task1() {
//  Задание 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//	           Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//	           В результате должен быть новый массив без указанного числа.
        System.out.println("\nЗадание 1. Удалите все вхождения заданного числа из массива");

        int[] massiv1 = {0, 1,-1,-2, 3, 5, 6, 7, 8, 9, 11};
        Arrays.sort(massiv1);
        System.out.println(Arrays.toString(massiv1));
        System.out.println("Введите целое число, которое следует удалить:");
        int number1 = scanner.nextInt();

        int[] massiv11=new int[massiv1.length];
        int X = Arrays.binarySearch(massiv1, number1);
        if (X >= 0) {System.arraycopy(massiv1,0,massiv11,0,massiv1.length);
            massiv11[X]=0;
            System.out.println(number1 + " Найдено с индексом " + X);
            System.out.println(Arrays.toString(massiv11));}
        else  {System.out.println(number1 + " Не найдено");}
    }

    private static void task2() {
//  Задание 2. Создайте и заполните массив случайным числами и выведете максимальное,
//  минимальное и среднее значение. Для генерации случайного числа используйте метод Math.random().
//  Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
        System.out.println("\nЗадание 2. Создайте и заполните массив случайным числами и выведете максимальное,\n" +
                "//  минимальное и среднее значение.");

        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        int[] massiv2 = new int[n];
           for (int i = 0; i < n; i++) {massiv2[i] = (int) (Math.random()*100)+1;}
        System.out.println(Arrays.toString(massiv2));

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < massiv2.length; i++) {
            max = Math.max(max, massiv2[i]);}
        System.out.println("Максимальный элемент: " + max);

        int min = Integer.MAX_VALUE;
                for (int i = 0; i < massiv2.length; i++) {
            min = Math.min(min, massiv2[i]);}
        System.out.println("Минимальный элемент: " + min);

        int sum = 0;
        for (int x: massiv2) {
            sum += x;}
        System.out.println("среднее арифметическое чисел равно: " + sum/massiv2.length);
    }

    private static void task3() {
//  Задание 3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
//	Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов
//	это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        System.out.println("\nЗадание 3. Сравните 2 массива");

        int[] massiv3 = new int[5];
           for (int i = 0; i < 5; i++) {massiv3[i] = (int) (Math.random()*100)+1;}
        System.out.println(Arrays.toString(massiv3));
        int[] massiv33 = new int[5];
           for (int i = 0; i < 5; i++) {massiv33[i] = (int) (Math.random()*100)+1;}
        System.out.println(Arrays.toString(massiv33));

        int sum3 = 0;
        for ( int x: massiv3) {
            sum3 += x;}
        System.out.println("среднее арифметическое чисел равно: " + sum3/massiv3.length);

        int sum33 = 0;
        for ( int y: massiv33) {
            sum33 += y;}
        System.out.println("Среднее арифметическое чисел равно: " + sum33/massiv33.length);

        if (sum3>sum33){System.out.println("среднее арифметическое чисел массива 1 больше");}
            else if (sum3<sum33) {System.out.println("среднее арифметическое чисел массива 2 больше");}
            else {System.out.println("среднее арифметическое чисел массива 1 и 2 равны");}









    }
}




//public class Main
//{
//    public static int getRandomDiceNumber()
//    {
//        return (int) (Math.random() * 6) + 1;
//    }
//
//    public static void main(String[] args)
//    {
//        for (int i = 0; i < 5; i++)
//        {
//            int x = getRandomDiceNumber();
//            System.out.println(x);
//        }
//    }
//}
