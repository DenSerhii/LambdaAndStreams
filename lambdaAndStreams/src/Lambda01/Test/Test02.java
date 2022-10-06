package Lambda01.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        System.out.println("______________sort_______________");
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(7);

        list.sort(null);
        list.forEach(System.out::println);

        System.out.println("------------------");
        //revers
        list.sort(Comparator.reverseOrder());
        list.forEach(System.out::println);


        System.out.println("_______lambda________>____");
        list.sort((x1,x2)->{
            return x1-x2;//<--be carefully!!!
        });
        list.forEach(System.out::println);

        System.out.println("_____lambda#2_________<____");
        list.sort((x1,x2)->-x1+x2);
        list.forEach(System.out::println);

        System.out.println("_____lambda#3__________>___");
        list.sort(Integer::compare);
        list.forEach(System.out::println);





    }
}
