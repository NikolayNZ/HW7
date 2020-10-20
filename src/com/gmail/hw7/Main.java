package com.gmail.hw7;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Написать программу которая вернет количество миллисекунд
        прошедших от такого же числа, но в прошлом месяце до сегодняшней
        даты. Например если сегодня 3 августа, то узнать сколько миллисекунд
        прошло с 3 июля.*/
        Calendar cl = Calendar.getInstance();
        Date date = cl.getTime();
        cl.add(Calendar.MONTH, -1);
        Date old = cl.getTime();
        long ms = date.getTime() - old.getTime();
        System.out.println("Количество милисикунд за прошлый месяц:  " + ms);

        /*Написать свой вариант метода Arrays.toString() для int[].*/
        int [] array = {1, 2, 3, 4, 5};
        System.out.println(toString(array));
        }
        public static String toString (int [] array) {
        StringBuilder sb = new StringBuilder (" ('_') ") ;
        for (int i = 0; i < array.length; i++) {
            sb.append(array [i] + " ");
        }
        sb.append(" (*_*) ");
        return sb.toString();

        /*Ввести с консоли число в бинарном формате. Перевести его в
        десятичный и вывести на экран (“10” -> 2).*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите бинарное число:");
        String binary = sc.nextLine();
        toNumber(binary);
        }
        static void toNumber(String binary) {
        char[] a = binary.toCharArray();
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '1') {
                d = (int) (d + (1 * Math.pow(2, a.length - 1 - i)));
            } else if (a[i] != '0') {
                System.out.println("Не корректное число");
                return;
            }
        }
        System.out.println("\"" + binary + "\" -> " + d);

        /*Выведите на экран 10 строк со значением числа Пи. Причем в первой
строке должно быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.*/
            for (int i = 2; i < 12; i ++) {
            Formatter form = new Formatter();
            System.out.println(form.format("%." + i + "f", Math.PI));
        }
    }
}