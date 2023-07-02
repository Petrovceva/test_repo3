//*Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class task3_2 {

    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList(Arrays.asList());
        //List numbers = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list_num.add(random.nextInt(100));
        }
        System.out.println("Произвольный список целых чисел: " + list_num);

        Iterator iterator = list_num.iterator();
        while (iterator.hasNext()) {
            int number = (int) iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Список без четных чисел: " + list_num);
        System.out.println("Минимальное значение: " + MinNum(list_num));
        System.out.println("Максимальное значение: " + MaxNum(list_num));
        System.out.println("Среднее значение: " + Sredn(list_num));
    }

    static Integer MaxNum(List<Integer> arrList) {
        int max = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        } 
        return max;
    }
    static Integer MinNum(List<Integer> arrList) {
        int min = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        } 
        return min;
    }
    static Double Sredn(List<Integer> arrList) {
        int sum = 0; 
        double srednee;
        for (int i=0; i < arrList.size()-1; i++) {
            sum += arrList.get(i);
        } 
        srednee = sum / arrList.size();
        return srednee;
    }
}
