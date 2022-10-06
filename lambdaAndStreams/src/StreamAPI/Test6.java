package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("ab");
        list.add("abcd");
        list.add("12");
        list.add("1234");
        list.add("abc");
        list.add("12");
        list.add("1234");
        list.add("abc");

        Optional<Integer>o=list.stream()
                .map(String::length)
                        .collect(Collectors.maxBy(Comparator.naturalOrder()));

//
        o.ifPresent(System.out::println);
    }
}
