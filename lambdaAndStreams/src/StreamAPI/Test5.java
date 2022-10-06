package StreamAPI;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("ab");
        list.add("abcd");
        list.add("12");
        list.add("1234");
        list.add("abc");

        Map<Integer,List<String>>map=list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map);
        System.out.println(map.values());
        List<String>list1=map.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        list1.forEach(System.out::println);
    }
}
