/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nartea_exam1;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class Nartea_Exam1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1, 2, 3, 4, or 5");
        System.out.println("choose numbers 1-5 to review: ");
        int choose = s.nextInt();
        switch (choose) {
            case 1:
                one();
                break;
            case 2:
                two();
                break;

            case 3:
                three();
                break;
            case 4:
                four();
                break;
            case 5:
                five();
                break;
        }
    }

    public static void one() {
        int[] arr = {1, -2, 3, -4, 5};
        
        System.out.println("the arrays: " + Arrays.toString(arr));
        if(arr[0]<0&&arr[1]<0&&arr[2]<0&&arr[3]<0&&arr[4]<0){
            System.out.println("0");
        }else{
            int sum = (arr[0]) + (arr[2]) + (arr[4]);
        System.out.println("sum of all positive integers: " + sum);
        }
    }

    public static void two() {
        String[] names = {"banana", "apple", "lanzones", "durian", "rambotan", "kiwi", "mansanitas",};
        System.out.println("Original Set Of Array:");
        printArray(names);
        bubbleSort(names);

        System.out.println("\nsorted: ");
        printArray(names);
        bubbleSort(names);
    }

    public static void bubbleSort(String arr[]) {
        int n = arr.length;
        boolean s;
        for (int i = 0; i < n - 1; i++) {
            s = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String m = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = m;
                    s = true;
                }

            }

        }

    }

    public static void printArray(String arr[]) {
        for (String num : arr) {
            System.out.println(num + "");
        }

    }

    public static void three() {
        int[]myArray={5,4,3,2,1};
        int Arrlength=myArray.length;
        System.out.println(Arrays.toString(myArray));
        System.out.println("length of the array is : " +Arrlength );

    }

    public static void four() {
        int size=10;
        int[] positiveEvenNumbers= new int[size];
        
        int numbers=2;
        for (int i = 0; i < size; i++) {
            positiveEvenNumbers[i]=numbers;
            numbers+=2;
        }
        System.out.println("positive even numbers");
        for (int number : positiveEvenNumbers) {
            System.out.println(number+" ");
            
        }
            
        }
        public static void five(){
                 Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter  the size of array:");
                
        int size = scanner.nextInt();
        int []array = new int[size];
        
        System.out.print("Enter "+size+" numbers : ");
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();
 System.out.println(fibonacci(0));
        }
    }
    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        return(fibonacci(n-1)+fibonacci(n-2));
        }
    
    }





