package Lesson4;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        //объявляем массив
        int[] ints = new int[10];
        // заполняем массив

        ints[0] = 20;
        ints[1] = 230;
        ints[2] = 240;
        ints[3] = 420;
        ints[4] = 10;
        ints[5] = 2;

        // вызов ссылки на первый элемент
        System.out.println(ints);
        // чтобы вывести массив
        System.out.println(Arrays.toString(ints));

        // инициализируется null, так как ссылочный тип, примитивный будут 0
        String[] strings = new String[5];
        // объявить массив и заполнить, два способа
        long[] longs = new long[]{123L, 321L, 333L};
        long[] longs1 = {123L, 321L, 333L};
        System.out.println(Arrays.toString(longs));
        System.out.println(Arrays.toString(longs1));

        // передавать объекты
//        Car[] cars = new Car[3];
//        cars[0] = new Car();


        //цикл for
        for (int i = 0; i < longs1.length; i++) {
            if (i % 2 == 0) {
                System.out.println(longs1[i]);
            }
        }

        //цикл foreach

//        for(Car car: cars){
//            if(car.getColor()==Color.BLACK){
//                continue;
//            }
//            System.out.println(car);
//        }

        //do-while

        int x = 0;

        do {
            //logic
            System.out.println(x++);
        } while (x != 10);

        //while

        while (x != 5) {
            //logic
            System.out.println(x++);
            if (x == 3) {
                break;
            }

            if (x == 2) {
                continue;
            }
            System.out.println("end of cycle");
        }
        varargMethod(123,"Hello");
        varargMethod(123,"Hello","world","!!!");


        // сортировка
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        //бинарный поиск - по какому индексу число 10

        System.out.println(Arrays.binarySearch(ints, 10));
        /*если нет числа в массиве, будет
        отрицательное значение и число 7
         */
        System.out.println(Arrays.binarySearch(ints, 100));



    }

    // передать аргумент в виде массива
    public void someMethod(String[] arr) {
        System.out.println(Arrays.toString(arr));

    }

    /* передать аргумент переменной длинны
    можно передать массив или строку,
    нельзя передать несколько подобных,
    всегда должен быть последним
     */

    public static void varargMethod(Integer integer, String... line) {
        System.out.println(Arrays.toString(line));

    }
}
