package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();

        list.add(1);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);

        List<Integer> list2=list.stream()
                .filter(x-> x <=4)
                .collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(list2.getClass());

    }
}
