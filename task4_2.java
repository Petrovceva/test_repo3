// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class task4_2 {

    static int makeInt(Deque<String> arr) {
        int result=0;
        String inS;  
        int krat = 1;

        while(arr.size() != 0) {
            inS = arr.pollFirst();
            if (!inS.equals("-")) {
                result = result + krat * (Integer.parseInt(inS));
                krat *= 10;
            } else {
                result *= -1;
            }
        }
        return result;
    }

    static Queue<String> Pack(int n) {
        Deque<String> q = new LinkedList<>();
        int temp = 0;
        boolean negative = false;
        if (n < 0) {
            n *= -1;
            negative = true;
        }
        while (n > 0) {
            temp = n % 10;
            n = (n - temp) / 10;
            q.addFirst(Integer.toString(temp));
        }
        if (negative) {
            q.addFirst("-");
        }
        return q;
    }
    public static void main(String[] args) {

        Deque<String> list_1 = new LinkedList<>(Arrays.asList("3","2","1", "-"));
        Deque<String> list_2 = new LinkedList<>(Arrays.asList("7","4","2"));
                
        System.out.println("Коллекции: " + list_1 + ", " + list_2);
                
        int first_num = makeInt(list_1);
        int second_num = makeInt(list_2);
        int mult = first_num * second_num;
        System.out.printf("%d * %d = %d\n", first_num, second_num, mult);
        
        int sum = first_num + second_num;
        System.out.printf("%d + %d = %d\n", first_num, second_num, sum);
        System.out.println(Pack(mult));
        System.out.println(Pack(sum));
    }
}
