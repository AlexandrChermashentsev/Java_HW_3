package Seminar_3_HW;
// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list_my = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(100);
            list_my.add(val);
        }

        System.out.println(list_my);
        int max_elem = list_my.get(0);
        int min_elem = list_my.get(0);
        int summ = 0;

        for (int i = 0; i < list_my.size(); i++) {
            if (list_my.get(i) > max_elem) {
                max_elem = list_my.get(i);
            }
            if (list_my.get(i) < min_elem) {
                min_elem = list_my.get(i);
            }
            summ += list_my.get(i);
        }

        float average = (float)summ/list_my.size();
        System.out.printf("max -> %s\n", max_elem);
        System.out.printf("min -> %s\n", min_elem);
        System.out.printf("average -> %s\n", average);
    }
}