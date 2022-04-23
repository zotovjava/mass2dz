package ru.skypro;

public class Main {
//Задача 1

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        for (int i: arr) {
            sum += i;
        }

        System.out.println("The amount of expenses for the month was " + sum + " rubles");
        System.out.println("=============================================");

        //Задача 2
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //System.out.println(max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum amount spent per day was " + min + " rubles. The maximum amount spent per day was " + max + "rubles");
        System.out.println("=============================================");

        //Задача 3
        double mid = sum / arr.length;
        System.out.println("The average amount spent for the month was " + mid + " rubles");
        return arr;



    }


}
