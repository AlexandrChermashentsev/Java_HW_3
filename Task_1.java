package Seminar_3_HW;
// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(100);
            list1.add(val);
        }
        System.out.println(list1);
        
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) % 2 != 0) {
                    resultList.add(list1.get(i));
                }
            }
        System.out.printf("Result List -> %s", resultList);
    }
}