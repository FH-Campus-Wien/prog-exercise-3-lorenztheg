package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void oneMonthCalendar(int daysTotal , int firstDay) {
        int col = 7;
        int row = 0;
        int breakpoint = 0;
        for (int i = 1; i <= col; i++)
        {
            if (i == firstDay)
                {
                    for (int j = 1; j <= daysTotal; j++)
                        {
                            if (j < 10)
                                {
                                    System.out.print(" " + j + " ");
                                }
                            else
                                {
                                    System.out.print(j + " ");
                                }
                            breakpoint++;
                            if (breakpoint % 7 == 0)
                                {
                                    if (row <= 4){
                                        System.out.println();
                                    }
                                    row++;
                                }
                        }
                }
            else if (breakpoint < firstDay){
                System.out.print("   ");
                breakpoint++;
            }
        }
        if(breakpoint % 7 != 0){
            System.out.println();
        }
    }

    public static long[] lcg(long seed){
        int e = 2;
        int f = 31;
        double m = Math.pow(e,f);
        int a = 1103515245;
        int c = 12345;
        long z = 0;
        long mLong = (new Double(m)).longValue();
        long[] array = new long[10];
        for (int i = 0; i < 10; i++)
            {
                z = ((a * z +c) % mLong);
                array[i]=z;
            }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    public static void guessingGame(int numberToGuess){
        for (int i = 1; i <= 10; i++) {
            System.out.print("Guess number " + i + ": ");
            int number = scanner.nextInt();
            if (i == 10 && number != numberToGuess)
                {
                    System.out.println("You Lost! Have you ever heard of divide & conquer?");
                }
            else if (number > numberToGuess)
                {
                    System.out.println("The number AI picked is lower than your guess.");
                }
            else if (number < numberToGuess)
                {
                    System.out.println("The number AI picked is higher than your guess.");
                }
            else
                {
                    System.out.println("You won wisenheimer!");
                    i = 11;
                }
        }
    }
    public static int randomNumberBetweenOneAndHundred(){
        Random numberToGuess = new Random();
        int low = 1;
        int high = 100;
        return numberToGuess.nextInt(high - low) + low;
    }

    public static boolean swapArrays(int[] array1, int[] array2){
        int arrLenght1 = array1.length;
        int arrLenght2 = array2.length;
        if ( arrLenght1 == arrLenght2)
        {
            for (int i = 0; i < arrLenght1; i++) {
                array1[i] = array1[i] ^ array2[i];
                array2[i] = array1[i] ^ array2[i];
                array1[i] = array1[i] ^ array2[i];
            }
            for (int j : array1) {
                System.out.print(j + " ");
            }
            System.out.println();
            for (int i = 0; i < arrLenght1; i++) {
                System.out.print(array2[i] + " ");
            }
            System.out.println();
            return true;
        }
        else {
            return false;
        }
    }
    public static int [] array1(){
        int[] array1;
        array1 = new int[]{1, 2, 3, 4, 5};
        return array1;
    }
    public static int [] array2(){
        int[] array2;
        array2 = new int[]{100,99,60,44,2};
        return array2;
    }
    public static void camelCase(String sentence){
        char[] main = sentence.toCharArray();
        int spaces = 0;
        int c = 0;
        int length = main.length;
        for (int i = 0; i < length; i++) {
            char letter = (char) main[i];
            if(i==0){
                letter = (char) (main[i] & 0x20);
            }
            if (letter < 98){

            }
        }
    }

    public static void checkDigit(int [] input){
        int sum1=0;
        int length = input().length;
        int [] gewichtung;
        gewichtung = new int[] {2,3,4,5,6,7,8,9,10};
        int[] sum = new int[length];
        for (int i = 0; i < length ; i++) {
            int num1 = input[i];
            int num2 = gewichtung[i];
            sum[i] = num1 * num2;
            sum1 = sum[i] + sum1;
        }
        int modulo = sum1 %11;
        int check = 11 - modulo;
        if (check == 10){
            check = 0;
            System.out.println(check);
        }
        else if (check == 11) {
            check = 5;
            System.out.println(check);
        }
        else {
            System.out.println(check);
        }
    }
    public static int [] input(){
        int[] input;
        input = new int[]{5, 2, 3, 8, 5};
        return input;
    }


    public static void main(String[] args) {

        System.out.println("Task 1: One Month Calendar");
        oneMonthCalendar(28,2);

        System.out.println("Task 2: Pseudo Random Numbers");
        lcg(0);

        System.out.println("Task 3: Guessing Game");
        guessingGame(randomNumberBetweenOneAndHundred());

        System.out.println("Task 4: Swap Arrays");
        swapArrays(array1(),array2());

        System.out.println("Task 5: Camel Case");
        camelCase("Was'n lOs mit dIR");

        System.out.println("Task 6: Check Digit");
        checkDigit(input());



        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}