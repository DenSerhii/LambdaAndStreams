package Lambda01.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test01 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(7);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("__________or_____lambda_______");

        list.forEach(x-> System.out.println(x));

        System.out.println("__________or___#2__lambda_______");
        list.forEach(System.out::println);




    }
}
