import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task5_5 {
    //List<String> list = new ArrayList<>();
    HashMap<String, List<String>> map = new HashMap<>();
    
    public void addPhone(String surName, String phone) {
        if(map.containsKey(surName)) {
            map.get(surName).add(phone);
        }
        else {
            List<String> phoneList= new ArrayList<>();
            phoneList.add(phone);
            map.put(surName, phoneList);
        }
    }
    public Task5_5() {
        phones.put("Иванов", "1234");
        phones.put("Васильев", "2345");
        phones.put("Петров", "3456");
        phones.put("Иванов", "4567");
        phones.put("Петров", "5678");
        phones.put("Иванов", "6789");
    }
    
    public void getPhoneInfoBySurName(String surName) {
        for (final Map.Entry<String, List<String>> phoneEntrySet : map.entrySet()) {
            //if (phoneEntrySet.getValue().equals(surName)) {
            if (phoneEntrySet.getKey().equals(surName)) {
                System.out.println(phoneEntrySet.getValue());
            }
        }
    }
    public static void main(String[] args) {
        Task5_5 task5_5 = new Task5_5();
        Scanner in = new Scanner(System.in);
        task5_5.getPhoneInfoBySurName(in.next());
    }
}
