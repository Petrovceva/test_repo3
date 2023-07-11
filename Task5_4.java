import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task5_4 {
    List<String> list = new ArrayList<>();
    HashMap<String, List<String>> phones = new HashMap<>();
    
    public Task5_4() {
        phones.put("Иванов", "1234");
        phones.put("Васильев", "2345");
        phones.put("Петров", "3456");
        phones.put("Иванов", "4567");
        phones.put("Петров", "5678");
        phones.put("Иванов", "6789");
    }
    
    public void getPhoneInfoByLastName(String lastName) {
        for (final Map.Entry<String, List<String>> phoneEntrySet : phones.entrySet()) {
            if (phoneEntrySet.getValue(). equals(lastName)) {
                System.out.println(phoneEntrySet.getKey());
            }
        }
    }
    public static void main(String[] args) {
        Task5_4 task5_4 = new Task5_3();
        Scanner in = new Scanner(System.in);
        task5_4.getPhoneInfoByLastName(in.next());
    }
}
