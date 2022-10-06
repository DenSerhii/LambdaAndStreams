package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();

        list.add(1);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);

        Map<Integer,Integer>map=list.stream()
                .collect(Collectors.toMap(x->x, x->x*x));

        map.forEach((k,v)->
                System.out.printf("%s==>%s%n",k,v));
        System.out.println();
    }
}
