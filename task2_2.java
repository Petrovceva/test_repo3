import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
/*2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
*/
public class task2_2 {
    /*
    private static Logger log = Logger.getLogger(task2_2.class.getName());
        public void someMethod(){
            Log.info("Some message");
        }
    */
    //private static final Logger logger = LoggerFactory.getLogger(task2_2.class); // не получается, как на 2-ом семинаре
    public static void main(String[] args) {
        int [] mas = {7, 5, 3, 1, 100, 90, 80, 85};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
