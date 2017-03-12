package practic_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SergLion on 30.01.2017.
 */
public class WordCounter {

    public static String parseString(String path, String charset) {

        StringBuilder sb = new StringBuilder();
        String s = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), charset))) {

            while ((s = br.readLine()) != null) {

                sb.append(s);

            }


        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static void splitString(String text) {

        Map<String, Integer> hashMap = new LinkedHashMap<>();
        String s = null;

        //String[] strings = text.split(" ");
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {

            s = matcher.group();
            if (hashMap.containsKey(s)) {
                Integer integer = hashMap.get(s);
                hashMap.put(s, ++integer);
            } else {
                hashMap.put(s, 1);
            }


        }

        System.out.println(hashMap.toString());


    }

    public static Integer incrementInt(Integer integer) {
        integer = integer + 1;

        return integer;

    }

    public static void splitString(String path, Direction sortDirection) {

        Map<String, Integer> hashMap = new LinkedHashMap<>();
        String s = null;

        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(parseString(path, "utf-8"));

        while (matcher.find()) {
            s = matcher.group();
            if (hashMap.containsKey(s)) {
                Integer integer = hashMap.get(s);
                hashMap.put(s, ++integer);
            } else {
                hashMap.put(s, 1);
            }
        }

       // System.out.println(hashMap.toString());

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

        switch (sortDirection) {
            case RIGHT:


                list.sort(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                });
                System.out.println(list.toString());
                break;
            case DOWN:

                list.sort((o1, o2) -> o2.getKey().compareTo(o1.getKey()));
                System.out.println(list.toString());
                break;
            case FREQUENCY_RIGHT:

                list.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
                System.out.println(list.toString());
                break;
            case FREQUENCY_DOWN:

                list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
                System.out.println(list.toString());
                break;
        }


    }

    public enum Direction {
        RIGHT,
        DOWN,
        FREQUENCY_RIGHT,
        FREQUENCY_DOWN;

    }


}
