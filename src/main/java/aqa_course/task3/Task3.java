package aqa_course.task3;

import java.util.*;

public class Task3 {
//    Array Reverse: Write a Java program that takes an array of integers and reverses its elements.
//    Your program should prompt the user to enter the array size and the elements of the array, and then output the reversed array.
//    Make HashSet of doubles from the result array and perform the following operations:
//    a) Add an element to the end of the list;
//    b) Remove an element from the list;
//    c) Replace an element in the list;
//    d) Sort the list in alphabetical order;
//    e) Print the elements of the list;
//    Make up the situation for ArrayIndexOutOfBoundsException. Catch it and display the explanation for your custom case.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("введіть розмір першого масиву: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("введіть елементи першого масиву:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("введіть розмір другого масиву: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("введіть елементи другого масиву:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Set<Integer> set1 = new HashSet<>();
        for (int x : arr1) {
            set1.add(x);
        }

        List<Integer> inter = new ArrayList<>();
        for (int x : arr2) {
            if (set1.contains(x)) {
                inter.add(x);
            }
        }

        System.out.println("перетин масивів: " + inter);

        LinkedList<Integer> list = new LinkedList<>(inter);

        list.addFirst(100);
        list.addLast(200);
        if (!list.isEmpty()) list.removeFirst();
        if (!list.isEmpty()) list.removeLast();

        System.out.print("список у зворотному порядку: ");
        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("помилка: ділення на нуль неможливе");
        }
    }
}