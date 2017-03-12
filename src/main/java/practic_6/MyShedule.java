package practic_6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by SergLion on 08.02.2017.
 */
public class MyShedule {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1. 1000", "Hello");
        map.put("2. 2000", "My name is Serg");
        map.put("3. 500", "I'm fine");
        map.put("4. 1000", "Now I try to learn English ");
        map.put("5. 1000", "It's very interesting");
        map.put("6. 3000", "the proses of knowing new words");
        map.put("7. 500", "Bye");
        shedule(map);

    }

    public  static void shedule(Map map) {
        int count = 0;
        for (Object o : map.entrySet()) {
            System.out.println(++count);
            Map.Entry entry = (Map.Entry) o;
            String key = (String) entry.getKey();
            String[] srt = key.split(" ");
            int time = Integer.valueOf(srt[1]);
            System.out.println(time);
            try {
                Thread.currentThread().sleep(time);
                System.out.println((String) entry.getValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
