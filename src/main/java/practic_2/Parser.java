package practic_2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SergLion on 20.01.2017.
 */
public class Parser {



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

    public static List<Rating> parseRating(String text) {

        List<Rating> ratingList = new ArrayList<>();

        Rating ratingObject;

        Pattern pattern = Pattern.compile("<tr align=\"right\"><td>(?<rating>\\d{1,4})</td><td>(?<nameMan>\\w+)</td><td>(?<nameWoman>\\w+)</td>");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {

            String d = matcher.group("rating");

            int rating = Integer.parseInt(d);
            String nameMan = matcher.group("nameMan");
            String nameWoman = matcher.group("nameWoman");

            //System.out.println(rating + " " + nameMan + " " + nameWoman);

            ratingObject = new Rating(rating, nameMan, nameWoman);

            ratingList.add(ratingObject);

        }

        return ratingList;
    }


    public static List<PriceLaptop> parseLaptop(String text1) {

        List<PriceLaptop> laptopList = new ArrayList<>();

        List<String> modelList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        String text2 = text1;


        PriceLaptop laptopObject;

        Pattern pattern1 = Pattern.compile("<h6 class=\"name\"><a href=\"http://elmir\\.ua/laptops/[\\w-]+\\.html\" class=\"item_name\" id=\"\\w+\" title=\"(\\W+ [\\w-\\(\\) ]+)\">(\\W+ (?<model>[\\w-\\(\\) ]+))</a></h6>");
        Pattern pattern2 = Pattern.compile("<td class=\"right-td\"><div class=\"buy_button\"><span title=\"([\\W \\d\\.]*)\" class=\"Tips2 icon_\\w+\"></span><span class=\"price cost\">((?<price>\\d+) \\W+)</span><br><span class=\"no-print\">");
        Matcher matcher1 = pattern1.matcher(text1);
        Matcher matcher2 = pattern2.matcher(text2);
        while (matcher1.find()) {

            //int price = Integer.parseInt(matcher.group("price"));
            //String description = matcher.group("description");
            String model = matcher1.group("model");

            System.out.println(model);
            modelList.add(model);

        }

        while (matcher2.find()) {
            String price = matcher2.group("price");
            System.out.println(price);
            priceList.add(price);
        }


        return laptopList;
    }





}
