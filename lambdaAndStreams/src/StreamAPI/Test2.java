package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();

        list.add(1);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);

        //List<Integer> list2=
               boolean a = list.stream()
                        .allMatch(x-> x<10);
        System.out.println(a);


    }
}
